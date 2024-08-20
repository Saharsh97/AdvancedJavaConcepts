package org.example.backwardsCompatible;

import org.example.genericsUsingObject.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        // Java version, 1 2 3 4
        Pair p1 = new Pair("World", 100);
        Pair p2 = new Pair(50.8, true);     // allows more types.
        Pair p3 = new Pair(90, "Saharsh");

        List list = new ArrayList();
        list.add("hello");
        list.add("there");
        list.add("world");
        list.add(100);
        list.add(90.5);

        List l2 = new ArrayList();
        List l3 = new ArrayList();

        Map map = new HashMap();
        map.put("hello", 100);
        map.put("there", 200);
        map.put(900, 120.9);

        // Java 5 introduced Generics.
        // how do you handle the older code now??

        List<GenericPair<String, Integer>> arrayList = new ArrayList<>();
        Map<String, Boolean> map1 = new HashMap<>();

        List<String> l4 = new ArrayList();
        List<Integer> l5 = new ArrayList();

        System.out.println("DEBUG");
    }
}
