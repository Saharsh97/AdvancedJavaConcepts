package org.example.Collections.comparableAndComparator;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {    // compare by any field that you want!
        return o1.getId() - o2.getId();
    }
}
