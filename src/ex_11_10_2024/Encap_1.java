package ex_11_10_2024;

public class Encap_1 {
    private String Username;
    private String Password;
    public Encap_1(String username, String password) {
        Username = username;
        Password = password;
    }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
