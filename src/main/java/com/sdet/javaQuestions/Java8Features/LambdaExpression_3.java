package com.sdet.javaQuestions.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression_3 {
    //Scenario: Get all numbers greater than 5 from a list.
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,6,8,9,12,7,4);
       List<Integer> nums = numbers.stream().filter((num)-> num >5).collect(Collectors.toList());
       System.out.println(nums);
    }
}
