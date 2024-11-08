package Task.Sep27;
import java.util.Scanner;

public class Dowhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age=sc.nextInt();
        do{
            System.out.println("Eligible for Voting : " +age);
            age++;
        }while(age>=18 && age<=25);
    }
}
