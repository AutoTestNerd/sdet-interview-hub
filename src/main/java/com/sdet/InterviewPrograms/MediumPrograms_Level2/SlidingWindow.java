package com.sdet.InterviewPrograms.MediumPrograms_Level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] a = {4,1,3,5,1,2,3,2,1,1,5};
        int k=3;
        Deque<Integer> qi = new ArrayDeque<Integer>();
        int i;
        for ( i = 0; i<k ; ++i) {
            while (!qi.isEmpty() && a[i]>=a[qi.peekLast()])
                qi.removeLast();

            qi.addLast(i);
        }
        for (; i <a.length; ++i) {

            System.out.print(a[qi.peek()]+ " ");
            //remove the elements which arr ou of this window
            while (!qi.isEmpty() && qi.peek()<=i-k){
                System.out.println("Peek  " + a[qi.peek()]);
                System.out.println("I  " + i);
                System.out.println("K  " + k);

                qi.removeFirst();
            }
            while (!qi.isEmpty() && a[i]>=a[qi.peekLast()])
                qi.removeLast();

            qi.addLast(i);

        }

        System.out.print(a[qi.peek()]);
    }
}
