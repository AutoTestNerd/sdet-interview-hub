package com.sdet.javaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample implements Comparable<ComparableExample> {
    String name;
    int age;

    ComparableExample(String name ,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int compareTo(ComparableExample o) {
     return   this.age=o.age;
    }
    @Override
    public String toString() {
        return age + " - " + name;
    }

    public static void main(String[] args) {
        List<ComparableExample> st = new ArrayList<>();
        st.add(new ComparableExample("Mniash",20));
        st.add(new ComparableExample("kumar",30));
        Collections.sort(st);
        System.out.println(st);

    }
}
