package Task.Sep25;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
       int n= s.nextInt();
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
