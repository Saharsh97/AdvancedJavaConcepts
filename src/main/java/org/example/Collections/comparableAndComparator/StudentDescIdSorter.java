package org.example.Collections.comparableAndComparator;

import java.util.Comparator;

public class StudentDescIdSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getId() - o1.getId();
    }
}
