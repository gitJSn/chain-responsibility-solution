package chain.responsibility.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;

public class IsAdminHandler implements IHandler {

    @Override
    public void setNext(IHandler handler) {
        // TODO Der Handler muss wissen wer der nächste in der Kette ist.
        // Siehe Beispiel im Vortrag
    }

    @Override
    public void handleRequest(Request request) {
        // TODO is nutzer admin? nutze das userRepository für die überprüfung
        // true -> next.handleRequest(request);
        // false -> Konsolenausgabe
    }

}
