package Interview;

import com.sun.nio.sctp.SctpSocketOption;

public class ReverseNumber {
    public static void main(String[] args) {
        int no=2563;
        int rev=0;
        while(no!=0){
            int rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println(rev);
    }
}
