package Interview;

public class Fibonacci {
    public static void main(String[] args) {
        int fib1=0;
        int fib2=1;
        int fib3=1;
        System.out.println(fib1+" " +fib2+" ");
        for(int i=1;i<=10;i++){
            fib3=fib1+fib2;
            System.out.println(fib3);
            fib1=fib2;
            fib2=fib3;

        }
    }
}




