package chain.responsibility.aufgabe.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;

public class LoggedInHandler implements IHandler {

    IUserService userService;
    private IHandler next;

    public LoggedInHandler(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (userService.checkUser(request.getEmail(), request.getPassword())) {
            System.out.println("Nutzer ist registriert! 😄 -> go next!");

            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("User ist nicht registriert 😐");
        }
    }
}
