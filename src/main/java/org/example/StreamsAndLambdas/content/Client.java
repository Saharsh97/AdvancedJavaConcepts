package org.example.StreamsAndLambdas.content;

public class Client {
//    public static void main(String[] args) {
//        Task task = new Task();
//        Thread thread = new Thread(task);
//        thread.start();
//    }

//    public static void main(String[] args) {
//        Runnable r = () -> {
//            System.out.println("Running by " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(r);
//        thread.start();
//    }

//    public static void main(String[] args) {
//        SampleInterface sample = (a, b) -> System.out.println(a + b);
//
//        sample.doSomething(10, 20);
//        sample.doHello();
//    }

    public static void main(String[] args) {
        SampleInterface sample = (a, b) -> {
            a *= 1000;
            b += 30;
            System.out.println(a + b);
        };

        sample.doSomething(10, 20);
        sample.doHello();
    }
}
