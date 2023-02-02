package chain.responsibility.aufgabe;

import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;
import chain.responsibility.handler.IsAdminHandler;
import chain.responsibility.handler.IsVipHandler;
import chain.responsibility.handler.LoggedInHandler;

public class App {
    public static void main(String[] args) {
        // DONT CHANGE!
        IUserService userService = new UserService();
        IHandler loggedInHandler = new LoggedInHandler(userService);
        IHandler isAdminHandler = new IsAdminHandler(userService);
        IHandler isVIPHandler = new IsVipHandler(userService);

        // Code hier drunter einfügen:

        // Bsp: Setze den VIP handler "hinter" den loggedInHandler
        loggedInHandler.setNext(isVIPHandler);

        // Starte die überprüfung loggedInHandler.handleRequest(...)
        loggedInHandler.handleRequest(new Request("VIP", "p4ssw0rd"));
    }
}
