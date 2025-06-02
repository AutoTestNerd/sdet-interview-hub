package com.sdet.InterviewPrograms.MediumPrograms_Level1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Max_Min_Element_13 {

    public static Integer kthMaxElement(int[] a, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <k ; i++) {

             pq.add(a[i]);
        }

        for (int j = k; j <a.length ; j++) {

            if(a[j]>pq.peek()){
                pq.poll();
                pq.add(a[j]);

            }
        }

        return pq.peek();
    }

    public static Integer kthMinElement(int[] a, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i <k ; i++) {

            pq.add(a[i]);
        }

        for (int j = k; j <a.length ; j++) {

            if(a[j]<pq.peek()){
                pq.poll();
                pq.add(a[j]);

            }
        }

        return pq.peek();

    }
    public static void main(String[] args) {
        int[] a= {5,8,9,23,-3,89,10,13,1,20,90,-2};
        int k =5;
        int res= kthMaxElement(a,k);
        System.out.println(res);
        int kthMin= kthMinElement(a,k);
        System.out.println(kthMin);
    }
}
