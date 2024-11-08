package Interview;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number\n");
        int num=s.nextInt();
        if(num%4==0){
            System.out.println("It's a Leap year");
        }
        else{
            System.out.println("It's not leap year");
        }
    }
}
