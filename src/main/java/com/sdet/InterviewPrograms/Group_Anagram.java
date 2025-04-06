package com.sdet.InterviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Group_Anagram {

    public static ArrayList<ArrayList<String>> findGroupAnagram(ArrayList<String> str){

Map<Map<Character,Integer>,ArrayList<String>> bmap = new HashMap<>();
        for (String st : str)
        {
          Map<Character,Integer> fmap = new HashMap<>();
            for (int i = 0; i <st.length() ; i++) {
              char ch = st.charAt(i);
              fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }

            if (bmap.containsKey(fmap)==false){
                ArrayList<String>list =new ArrayList<>();
                list.add(st);
                bmap.put(fmap,list);
            }
            else {
                ArrayList<String> list = bmap.get(fmap);
                list.add(st);
            }
        }


        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (ArrayList<String> ll :bmap.values()){
           res.add(ll);
        }
return res;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("dog");
        list.add("cat");
        list.add("god");
        list.add("act");
        list.add("ogd");
        list.add("tac");
        System.out.println(findGroupAnagram(list));
    }
}
