package org.example.StreamsAndLambdas.backup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 4, 2, 5, 6, 9, 10));

        System.out.println("\n------ The Usual Way to do Tasks ------\n");

        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i)*2); //
        }
        List<Integer> finalList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 10) {
                finalList.add(list.get(i)); // filter and store
            }
        }
        for(int i = 0; i < finalList.size(); i++){
            System.out.println(finalList.get(i));
        }

        Collections.shuffle(list);
        System.out.println("\n------ The Stream way to do tasks ------\n");

        list.stream()
                .map((x)-> x*2)
                .filter((x) -> x < 10)
                .forEach((x)-> System.out.println(x));


        Collections.shuffle(list);
        System.out.println("\n------ Using Streams for a lot more tasks ------\n");

        list.stream()
                .map((x)-> x*2)
                .filter((x) -> x < 10)
                .sorted((x, y)-> x - y)
                .map((x) -> x * 100)
                .filter((x) -> x % 4 == 0)
                .map((x) -> x * 25)
                .forEach((x)-> System.out.println(x));
        // without streams, you would have written a
        // lot more code with a lot of for loops.
        // not clean code.

        Collections.shuffle(list);
        System.out.println("\n------ Parallel Streams ------\n");
        // if you want to do batch processing.
        // list of size 1000.
        // break it into 5 lists.
        // for each list, a parallel stream.
        list.parallelStream()
            .map((x) -> {
                System.out.println("Multiply 2 * " + x + " by Thread: " + Thread.currentThread().getName());
                return x * 2;
            })
            .filter((x) -> {
                System.out.println("Filter " + x + " by Thread: " + Thread.currentThread().getName());
                return x < 10;
            })
            .forEach((x) -> {
                System.out.println(x);
            });
    }
}
