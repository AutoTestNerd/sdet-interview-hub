package com.sdet.javaQuestions;

class Counter{
    private int count = 0;

    public  synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
public class    synchronized_Example {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());



    }
}
