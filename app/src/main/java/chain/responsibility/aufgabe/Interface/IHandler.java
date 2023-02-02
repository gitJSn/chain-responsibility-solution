package chain.responsibility.aufgabe.Interface;

import chain.responsibility.aufgabe.Request;

public interface IHandler {
    void setNext(IHandler handler);

    void handleRequest(Request request);
}
