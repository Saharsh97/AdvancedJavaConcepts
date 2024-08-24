package org.example.StreamsAndLambdas.backup;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Client3 {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.func();

        SampleFunctionalInterface sampleInterface = () -> {
            System.out.println("doing via Lambda");
        };
        sampleInterface.func();

        SampleFunctionalInterface sampleInterface2 = new SampleFunctionalInterface() {
            @Override
            public void func() {
                System.out.println("doing via another Lambda");
            }
        };
        sampleInterface2.func();

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("I have accepted the integer: " + integer);
            }
        };
        consumer.accept(10);

        Consumer<Integer> consumer2 = (x) -> {
            System.out.println("Lambda shorter form accepted integer: " + x);
        };
        consumer2.accept(20);

        BiConsumer<String, Integer> biConsumer = (x, y) -> {
            System.out.println("Accepted both Name " + x + " and Age " + y);
        };
        biConsumer.accept("Saharsh", 27);
    }
}
