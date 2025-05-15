package com.sdet.javaQuestions.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Alice",25));

        emp.add(new Employee("Dlice",22));
        emp.add(new Employee("Blice",25));
        emp.add(new Employee("Clice",25));

        Collections.sort(emp, new NameComparator());
        for (Employee em : emp) {
            System.out.println(em.name + ": " + em.age);
        }
    }
}
