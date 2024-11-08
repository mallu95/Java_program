package ex_11_10_2024.access_modifier.police;

public class Cop {
    private int gun;
    private String id;
    private void canIshot(){
        System.out.println("Yes, You can Sjoot");
    }
    protected void display(){
        System.out.println("Display");
    }
}
