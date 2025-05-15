package com.sdet.javaQuestions.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",25));
        students.add(new Student("Blice",26));
        students.add(new Student("Clice",22));
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.name + ": " + student.age);
        }

    }
}
