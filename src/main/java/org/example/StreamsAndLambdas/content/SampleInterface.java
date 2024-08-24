package org.example.StreamsAndLambdas.content;

@FunctionalInterface
public interface SampleInterface {
    void doSomething(Integer a, Integer b);

    default void doHello(){
        System.out.println("Hello");
    }
}
