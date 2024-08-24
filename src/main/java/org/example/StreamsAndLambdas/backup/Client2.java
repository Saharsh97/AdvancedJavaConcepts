package org.example.StreamsAndLambdas.backup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rohit", 25, 90.5);
        Student s2 = new Student(2, "Virat", 24, 91.1);
        Student s3 = new Student(3, "Dhoni", 25, 90.8);
        Student s4 = new Student(4, "Surya", 23, 91.5);
        Student s5 = new Student(5, "Bumrah", 22, 90.5);
        Student s6 = new Student(6, "Sachin", 26, 92.1);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        System.out.println("\n------ Sorted ------\n");
        // if the Comparator has only 1 method.
        // then implementation means we are implementing which method??
        // the compare method, that the comparator wants!
        Comparator<Student> comparator = (st1, st2) -> {
            return st1.getPsp().compareTo(st2.getPsp());
        };
        students.sort(comparator);
        print(students);

        System.out.println("\n------ Randomized ------\n");
        Collections.shuffle(students);
        print(students);

        System.out.println("\n------ Again Sorted ------\n");
        students.sort((st1, st2) -> {
            return st1.getPsp().compareTo(st2.getPsp());
        });
        print(students);
    }

    private static void print(List<Student> students) {
        for(Student student : students) {
            System.out.println(student.getId() + "\t" + student.getName() + "\t\t" + student.getAge() + "\t" + student.getPsp());
        }
    }
}
