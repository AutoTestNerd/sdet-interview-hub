package com.sdet.InterviewPrograms;

import java.util.*;

public class PrintNthElementFromList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        int n=2;
        Integer element= null;
        //fint Nth Element - Using Get
        if(n>=0 & n< list.size()){
             element=  list.get(n);
        }
        else {
            System.out.println("Element not found: index " + n + " is out of bounds.");

        }

        System.out.print(element);


        //Using SteamAPi
        int element2= list.stream().skip(n).findFirst().orElse(null);
        System.out.print(element2);
        
        //Using for loops

        Integer element3=null;
        for (int i = 0; i <list.size() ; i++) {

            if(i==n){
                element3= list.get(i);
                break;
            }
        }
        System.out.print(element3);


        //Using Iterrator Inteface

        Iterator<Integer> it = list.iterator();
        Integer element4 =null;
        int index=0;
        while (it.hasNext()){
           Integer val= it.next();
           if(index==n){
               element4= val;
               break;
           }
           index++;

        }
        System.out.print(element4);

        ListIterator<Integer> lit = list.listIterator();
        Integer element5 =null;
        int index2=0;
        while (lit.hasNext()){
            Integer val= lit.next();
            if(index2==n){
                element5= val;
                break;
            }
            index2++;

        }
        System.out.print(element5);

        //using forech

        int index1=0;
        Integer Elemnet6 =null;
        for (Integer val:list){
            if (index1==n){
                Elemnet6= val;
                break;
            }
            index1++;

        }
        System.out.print(Elemnet6);



    }
}
