package org.example.genericUsingSpecificClass;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        PairStringInteger p1 = new PairStringInteger("hello", 10);
        PairDoubleBoolean p2 = new PairDoubleBoolean(100.5, false);
//        PairStringInteger p3 = new PairStringInteger(90, "Saharsh");

        List<PairStringInteger> list = new ArrayList<>(List.of(
                new PairStringInteger("Hello", 5),
                new PairStringInteger("Saharsh", 10)
        ));
//
        for(PairStringInteger pairStringInteger : list){
            String first = pairStringInteger.getFirst();
            Integer second = pairStringInteger.getSecond();
            System.out.println(first + " : " + second);
        }
    }
    // only problem: create million different classes for each requirement.
}
