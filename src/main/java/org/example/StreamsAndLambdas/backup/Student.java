package org.example.StreamsAndLambdas.backup;

import lombok.Getter;

@Getter
public class Student {
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
}
