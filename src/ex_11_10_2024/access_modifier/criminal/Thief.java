package ex_11_10_2024.access_modifier.criminal;
import ex_11_10_2024.access_modifier.police.Jrcop;

public class Thief {
    public static void main(String[] args) {
        Jrcop jr=new Jrcop(10);
        System.out.println(jr.gun);
        jr.canIshot();

    }
}
