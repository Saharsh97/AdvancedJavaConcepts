package org.example.StreamsAndLambdas.content;

import org.example.StreamsAndLambdas.backup.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 3, 4, 2, 5, 6, 9, 10));

        System.out.println("\n------ The Usual Way to do Tasks ------\n");

        for(int i = 0; i < list.size(); i++){
            //
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
        System.out.println(list);



        Collections.shuffle(list);
        System.out.println("\n------ The Stream way to do tasks ------\n");



    }
}
