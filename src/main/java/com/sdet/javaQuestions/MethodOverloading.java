package com.sdet.javaQuestions;

public class MethodOverloading {

    int add(int a, int b){
        return  a+b;
    }

    int add (int a , int b ,int c){
        return  a+b+c;
    }

    double add (double a ,double b){
        return  a+b;
    }


}

class overloadingExample{
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
       System.out.println(methodOverloading.add(1,2));
        System.out.println(methodOverloading.add(2.0,3.3));
        System.out.println(methodOverloading.add(1,3,4));
    }
}