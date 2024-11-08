package ex_11_10_2024;

public class Encap_2 {
    private String name;
    private long balance;

    public Encap_2(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isadmin) {
        if(isadmin) {
            this.balance = balance;
            System.out.println("You are admin");
        }else{
            System.out.println("You are not admin");
        }
    }
}
