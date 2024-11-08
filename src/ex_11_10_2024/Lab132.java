package ex_11_10_2024;

public class Lab132 {
    public static void main(String[] args) {
        Encap_1 E=new Encap_1("admin","Password");
        System.out.println(E.getUsername());
        System.out.println(E.getPassword());
        E.setPassword("Admin@123");
        System.out.println(E.getPassword());
    }
}
