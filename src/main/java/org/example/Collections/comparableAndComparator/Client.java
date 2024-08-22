package org.example.Collections.comparableAndComparator;

import java.util.*;

public class Client {
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

        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);

        System.out.println("\n------- Default Sort Order -------\n");

//        Collections.sort(students);

        print(students);

        Collections.shuffle(students);  // randomize the list again
        System.out.println("\n------- Sort Order in Desc -------\n");

//        Collections.sort(students);
        Collections.reverse(students);
        print(students);

        Collections.shuffle(students);  // randomize the list again
        System.out.println("\n------- Sort Order in Asc of ID-------\n");

        students.sort(new StudentSorter());// sort by any attribute!
        print(students);

        Collections.shuffle(students);  // randomize the list again
        System.out.println("\n------- Sort Order in Desc of ID -------\n");

        students.sort(new StudentDescIdSorter());
        print(students);

        Collections.shuffle(students);  // randomize the list again
        System.out.println("\n------- Sort Order in Asc of Name -------\n");

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        print(students);

        Collections.shuffle(students);  // randomize the list again
        System.out.println("\n------- Sort Order in Desc of PSP -------\n");

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getPsp().compareTo(o1.getPsp());
            }
        });
        print(students);

        System.out.println("\n------- Sort Order in Asc of PSP in PQ -------\n");


        PriorityQueue<Student> pq = new PriorityQueue<>(
        );
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);
        pq.add(s6);

        while(pq.size() > 0){
            Student student = pq.peek();
            System.out.println(student.getId() + "\t" + student.getName() + "\t\t" + student.getAge() + "\t" + student.getPsp());
            pq.poll();
        }
    }

    private static void print(List<Student> students) {
        for(Student student : students) {
            System.out.println(student.getId() + "\t" + student.getName() + "\t\t" + student.getAge() + "\t" + student.getPsp());
        }
    }
}
