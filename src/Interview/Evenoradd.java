package Interview;

public class Evenoradd {
        //Print even or odd number from 0 tp 50 upublic class Evenoradd {
    public static void main(String[] args) {
        // Print even or odd numbers from 0 to 50 using continue keyword
        System.out.println("Even numbers:");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number-> "+i);
                continue; // Skip odd numbers
            }
            System.out.println("Add Number ->"+i);
        }

    /*    System.out.println("\n\nOdd numbers:");
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {

                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }*/
    }
}

