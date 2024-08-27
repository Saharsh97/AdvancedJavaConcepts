package org.example.exceptions.multiLevelErrorHandling;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.println("Client entering values ...");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Client: giving task to manager");

        String responseFromManager = manager.assignTask(a, b);
        System.out.println("Client: Manager's Response : " + responseFromManager);
    }
}
