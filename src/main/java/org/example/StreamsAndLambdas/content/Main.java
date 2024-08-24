package org.example.StreamsAndLambdas.content;

import org.example.StreamsAndLambdas.backup.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 4, 2, 5, 6, 9, 10));

        System.out.println("\n------ The Usual Way to do Tasks ------\n");

//        // multiply by 2
//        for(int i = 0; i < list.size(); i++){
//            int current = list.get(i);
//            int multipliedNumber = current * 2;
//            list.set(i, multipliedNumber);
//        }
//        // multiply by 2
//        for(int i = 0; i < list.size(); i++){
//            int current = list.get(i);
//            int multipliedNumber = current * 5;
//            list.set(i, multipliedNumber);
//        }
//        // filtering
//        List<Integer> finalList = new ArrayList<>();
//        for(int i = 0; i < list.size(); i++){
//            if(list.get(i) < 10) {
//                finalList.add(list.get(i)); // filter and store
//            }
//        }
//        // printing
//        for(int i = 0; i < finalList.size(); i++){
//            System.out.println(finalList.get(i));
//        }
//        System.out.println(list);



//        Collections.shuffle(list);
        System.out.println("\n------ The Stream way to do tasks ------\n");
        System.out.println(list);
        System.out.println();
        // .map() for each number x, apply some logic on it
        // dont confuse this with the normal maps.

//        List<Integer> list = new ArrayList<>(List.of(1, 3, 4, 2, 5, 6, 9, 10));


        list.stream()
                .map( (x) ->  x * 2 )
                .map( (x) -> x * 5 )
                .filter( (x) -> x < 100 )
                .forEach( (x) -> System.out.println(x));

        // how to collect
        List<Integer> l2 = list.stream()
                .map( (x) ->  x * 2 )
                .map( (x) -> x * 5 )
                .filter( (x) -> x < 100 )
                .collect( Collectors.toList() );

        System.out.println("\n------ The Parallel Stream way to do tasks ------\n");
        System.out.println(list);
        System.out.println();


        // you have list of 10000
        // if my thread pool has 20 threads.
        // automatically assign 500 numbers to each thread
        list.parallelStream()
                .map( (x) ->  {
                    System.out.println("Map operation " + x + " picked by " + Thread.currentThread().getName());
                    return x * 2;   // add this number to the output stream.
                })
                .filter( (x) -> {
                    System.out.println("Filter operation " + x + " picked by " + Thread.currentThread().getName());
                    return x < 10;
                } )
                .forEach( (x) -> {
                    System.out.println("Print operation " + x + " picked by " + Thread.currentThread().getName());
                    System.out.println(x);
                });
    }
}
