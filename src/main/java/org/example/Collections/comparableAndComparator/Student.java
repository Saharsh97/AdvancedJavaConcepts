package org.example.Collections.comparableAndComparator;

import lombok.Getter;

@Getter
public class Student implements Comparable<Student>{    // default way to sort Students
    private Integer id;
    private String name;
    private Integer age;
    private Double psp;

    public Student(int id, String name, int age, double psp) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student o) {   // default sorting mechanism!
        return this.age - o.age;
    }
}
