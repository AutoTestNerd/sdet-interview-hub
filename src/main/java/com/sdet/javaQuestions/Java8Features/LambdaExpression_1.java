package com.sdet.javaQuestions.Java8Features;

public class LambdaExpression_1 {

    //Traditional Runnable Interface
//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread is running...");
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
//    }

    //lambda based expression
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Thread is running...");
        Thread thread = new Thread(task);
        thread.start();
    }




}
