package org.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int x = func();
            System.out.println("Main : Got result: " + x);
        } catch (Exception e){
            System.out.println("the method func failed");
        }
    }

    public static int func() throws EngineerNotAbleToWorkException {
        try{
//            File file = new File("abc.txt");
//            FileReader fileReader = new FileReader(file);
//            fileReader.read();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Got " + a + " and " + b);
            int d = a / b;
            System.out.println("Answer found " + d);
            return d;
        }
        catch (ArithmeticException aex) {
            System.out.println("Arithmetic exception occurred");
            throw new EngineerNotAbleToWorkException("hello");
        }
        catch (InputMismatchException imex) {
            System.out.println("InputMismatch exception occurred");
            return -2;
        }
//        catch (FileNotFoundException fnfe) {
//            System.out.println("File not found exception occurred");
//            return -3;
//        }
//        catch (IOException iex) {
//            System.out.println("IO exception occurred");
//            return -4;
//        }
        catch (Exception e){
            System.out.println("some generic exception occurred");
            return -10;
        }
        finally {
            System.out.println("Im in the final block");
            System.out.println("running few clean up tasks");
            System.out.println("closing down FileReaders");
            System.out.println("shutting down DB connections");
        }
        // if finally is not there, you would just return the values,
        // without closing the connections, fileReaders etc.
        // not closing them will keep increasing memory usage => Memory leaks.
    }
}
