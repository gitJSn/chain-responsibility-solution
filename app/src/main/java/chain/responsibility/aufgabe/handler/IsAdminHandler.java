package chain.responsibility.aufgabe.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;

public class IsAdminHandler implements IHandler {

    private IUserService userService;
    private IHandler next;

    public IsAdminHandler(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (userService.checkAdmin(request.getEmail(), request.getPassword())) {
            System.out.println("Nutzer ist Admin! 😄 (Zeige z.b. Adminübersicht)");

            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("User ist nicht Admin 😐");
        }
    }

}
