package Interview;


public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int i=5;
        for(i=5;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
