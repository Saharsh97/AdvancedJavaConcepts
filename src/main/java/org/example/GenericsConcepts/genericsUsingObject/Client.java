package org.example.GenericsConcepts.genericsUsingObject;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair("World", 100);
        Pair p2 = new Pair(50.8, true);     // allows more types.
        Pair p3 = new Pair(90, "Saharsh");

        List<Pair> list = new ArrayList<>(List.of(
                new Pair("Hello", 5),
                new Pair("Saharsh", 10),
                new Pair(100.0, 200),
                new Pair(100.5, false)
        ));

        for(Pair pair: list){
            String first = (String) pair.getFirst();
            Integer second = (Integer) pair.getSecond();
            System.out.println(first + " : " + second);
        }
    }
}
