package org.example.exceptions.multiLevelFileReaderException;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();

        System.out.println("Client: giving task to manager");
        String responseFromManager = manager.readFile("abc.txt");
        System.out.println("Client: Manager's Response : " + responseFromManager);
    }
}
