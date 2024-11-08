package ex_11_10_2024;

public class lab138 {
    public static void main(String[] args) {
        Encap_2 E=new Encap_2("Mallikarjun",10000);
        System.out.println(E.getName());
        System.out.println(E.getBalance());
        boolean are_you_admin=true;
        Encap_2 admin=new Encap_2("Admin", 10000);
        admin.setBalance(25000, are_you_admin);
        System.out.println(admin.getBalance());

    }
}
