package com.sdet.javaQuestions.Java8Features;

import java.util.*;

public class LambdaExpression_2 {
// Scenario: You have a list of names and want to sort them alphabetically.
public static void main(String[] args) {

        //using Anonuymous class
        List<String> names = Arrays.asList("manish" ,"kumar","Apple");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        System.out.println(names);


        // Using Lambda Expressionn

        names.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println(names);


    }
}
