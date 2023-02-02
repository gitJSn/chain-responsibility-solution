package chain.responsibility.aufgabe;

public class Request {
    String email;
    String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Request(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
