package chain.responsibility.aufgabe.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserService;

public class IsVipHandler implements IHandler {
    IUserService userService;
    private IHandler next;

    public IsVipHandler(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public void setNext(IHandler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(Request request) {
        if (userService.checkVIP(request.getEmail(), request.getPassword())) {
            System.out.println("Nutzer ist VIP! 😄");

            if (next != null) {
                next.handleRequest(request);
            }
        } else {
            System.out.println("User ist kein VIP");
        }
    }

}
