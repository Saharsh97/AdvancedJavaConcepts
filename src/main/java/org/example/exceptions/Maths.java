package org.example.exceptions;

import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        System.out.println(ReadFile.HELLO_THERE);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("starting... ");
        System.out.println(a/b);
        System.out.println("done");
    }
}
