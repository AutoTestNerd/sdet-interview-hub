package com.sdet.javaQuestions.Comparable_Comparator;

public class Student implements Comparable<Student> {

    String name;
    int age;
    Student(String name ,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age,other.age);
    }
}

