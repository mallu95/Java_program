package Task.OCT18;

public class Pallindrome {
    public static void main(String[] args) {
        String name = "gadag";
        String rev = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println(rev);
        if (name.equals(rev)) {
            System.out.println("String is Palindrome ");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
