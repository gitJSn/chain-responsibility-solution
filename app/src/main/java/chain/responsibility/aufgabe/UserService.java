package chain.responsibility.aufgabe;

import java.util.ArrayList;
import java.util.List;

import chain.responsibility.aufgabe.Interface.IUserService;

public class UserService implements IUserService {
    List<UserLogin> users = new ArrayList<>();

    public UserService() {
        users.add(new UserLogin("admin@admin", "123", true, false));
        users.add(new UserLogin("User", "12344", false, false));
        users.add(new UserLogin("VIP", "p4ssw0rd", false, true));
    }

    @Override
    public boolean checkUser(String email, String password) {
        for (UserLogin user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkAdmin(String email, String password) {
        for (UserLogin user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password) && user.isAdmin) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkVIP(String email, String password) {
        for (UserLogin user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password) && user.isVIP) {
                return true;
            }
        }
        return false;
    }
}