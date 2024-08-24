package org.example.StreamsAndLambdas.backup;

public class Client {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }

    public static void main1(String[] args) {
        // Runnable wants whatever is the object, it should hve a run method.
        // that run method, takes 0 parameters, and executes something, and returns nothing.
        // the below is exactly that function.
        Runnable r = () -> {
            System.out.println("doing something");
        };
        Thread thread = new Thread(r);
        thread.start();
    }

    public static void main2(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread " + Thread.currentThread().getName());
        });
        thread.start();
    }
}
