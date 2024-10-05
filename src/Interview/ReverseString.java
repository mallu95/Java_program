package Interview;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=s.next();
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
