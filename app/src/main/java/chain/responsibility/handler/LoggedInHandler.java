package chain.responsibility.handler;

import chain.responsibility.aufgabe.Request;
import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserRepository;

public class LoggedInHandler implements IHandler {

    IUserRepository userRepository;

    public LoggedInHandler(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void setNext(IHandler handler) {
        // TODO Der Handler muss wissen wer der nächste in der Kette ist.
        // Siehe Beispiel im Vortrag
    }

    @Override
    public void handleRequest(Request request) {
        // TODO is nutzer eingeloggt? nutze das userRepository für die überprüfung
        // true -> next.handleRequest(request);
        // false -> Konsolenausgabe
    }

}
