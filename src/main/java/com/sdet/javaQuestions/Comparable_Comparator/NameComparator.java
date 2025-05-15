package com.sdet.javaQuestions.Comparable_Comparator;


import javax.swing.text.html.parser.TagElement;
import java.util.Comparator;
import java.util.EnumMap;

class Employee{
    String name;
    int age;
    Employee(String name ,int age){
        this.name = name;
        this.age =age;
    }

}
public class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
