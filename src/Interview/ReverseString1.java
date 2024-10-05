package Interview;

import java.util.Scanner;

public class ReverseString1 {

        public static void main(String[] args) {
            Scanner s=new Scanner(         System.in);
            System.out.println("Enter the String");
            String input=s.next();
            String rev="";
            for(int i=input.length()-1;i>=0;i--){
                rev=rev+input.charAt(i);
            }
            System.out.println(rev);
            if(input.equals(rev)){
                System.out.println("String is Palindrome ");
            }
            else {
                System.out.println("String is not Palindrome");
            }
        }
    }

