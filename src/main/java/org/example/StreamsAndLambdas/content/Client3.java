package org.example.StreamsAndLambdas.content;

import java.util.function.Consumer;

public class Client3 {
    public static void main(String[] args) {
//        SampleClass sampleClass = new SampleClass();
//        sampleClass.func();

//        SampleFunctionalInterface sampleFunctionalInterface = () -> {
//            System.out.println("hello there");
//        };
//        sampleFunctionalInterface.func();

//        SampleFunctionalInterface sampleFunctionalInterface = () -> System.out.println("hello there");
//        sampleFunctionalInterface.func();


//        Consumer<String> consumer = (a) -> {
//            System.out.println("Accepted " + a);
//        };
//        consumer.accept("hello there");


        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String a) {
                System.out.println("Accepted " + a);
            }
        };
        consumer2.accept("world");
    }
}
