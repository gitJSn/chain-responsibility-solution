package chain.responsibility.aufgabe;

import chain.responsibility.aufgabe.Interface.IHandler;
import chain.responsibility.aufgabe.Interface.IUserRepository;
import chain.responsibility.handler.LoggedInHandler;

public class App {
    public static void main(String[] args) {
        // DONT CHANGE!
        IUserRepository userRepository = new UserRepository();
        IHandler loggedInHandler = new LoggedInHandler(userRepository);

        // TODO
        // verknüpfe die Handler in der richtigen Reihenfolge
        // TIPP handler.setNext(....)

    }
}
