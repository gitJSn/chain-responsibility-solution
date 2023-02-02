package chain.responsibility.aufgabe;

public class UserLogin {
    String email;
    String password;
    boolean isAdmin;
    boolean isVIP;

    public UserLogin(String email, String password, boolean isAdmin, boolean isVIP) {
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isVIP = isVIP;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
