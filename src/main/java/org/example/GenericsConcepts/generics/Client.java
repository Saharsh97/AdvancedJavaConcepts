package org.example.GenericsConcepts.generics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(10, "ab");
        // A is mapped to Integer, B is mapped to String

//        Pair<Integer, String> pair2 = new Pair<>(false, 100);
        // A is mapped to Integer, B is mapped to String

        Pair<Double, Boolean> p3 = new Pair<>(90.5, false);
        // A is mapped to Double, B is mapped to Boolean

        List<Pair<String, Integer>> list = new ArrayList<>();
        list.add(new Pair<>("ab", 10));
        list.add(new Pair<>("xy", 20));
        list.add(new Pair<>("Saharsh", 100));
//        list.add(new Pair<>(99, "Rutuja"));
//        list.add(new Pair<>(80, 70.5));

        List<Pair<String, Integer>> list2 = new ArrayList<>(List.of(
                new Pair<>("Hello", 5),
                new Pair<>("Saharsh", 10)
        ));
//
        List<Pair<Double, Boolean>> l3 = new ArrayList<>(List.of(
                new Pair<>(100.4, true),
                new Pair<>(70.1, false)
        ));

        for(Pair<String, Integer> pair: list){
            String first = pair.getFirst();
            Integer second = pair.getSecond();
            System.out.println(first + " : " + second);
        }

        Map<String, Integer> map = new HashMap<>();
        List<Double> list1 = new ArrayList<>();
        Map<Double, String> map2 = new HashMap<>();

        Pair<Integer, Double> p10 = new Pair<>(100, 10.1);
        p10.doSomething(100);
        p10.heyThere(80, 100.9, false);

    }
}
