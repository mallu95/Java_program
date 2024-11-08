package ex_11_10_2024.access_modifier.police;
import ex_11_10_2024.access_modifier.police.Jrcop;
public class Jrcop {
    public int gun;
    public String id;

    public Jrcop(int gun) {
        this.gun = gun;
    }

    public void canIshot(){
        System.out.println("Yes, You can Shoot");
    }
}
