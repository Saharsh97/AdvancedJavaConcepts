package org.example.exceptions.multiLevelFileReaderHandling;

import org.example.exceptions.ReadFile;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println(ReadFile.HELLO_THERE);
        Manager manager = new Manager();

        System.out.println("Client: giving task to manager");
        String responseFromManager = manager.readFile("abc.txt");
        System.out.println("Client: Manager's Response : " + responseFromManager);
    }
}
