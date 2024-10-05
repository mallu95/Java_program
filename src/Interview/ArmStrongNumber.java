package Interview;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int no=154;
        int sum=0;
        int copy=no;
        while (no!=0){
            int rem=no%10;
            sum=sum+(rem*rem*rem);
            no=no/10;
        }
        if(copy==sum){
            System.out.println("Given number Armstrong");
        }
        else{
            System.out.println("Not Armstrong NUmber ");

        }
    }
}
