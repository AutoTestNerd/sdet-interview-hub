package com.sdet.InterviewPrograms.MediumPrograms_Level2;

import java.util.HashMap;
import java.util.Map;

public class Permutations_String {

    public static void generateWords(int cs, int ts, Map<Character, Integer> fmap, String asf) {
        if (cs > ts) {
            return; // base condition guard
        }
        if (cs == ts) {
            System.out.println(asf);
            return;
        }

        for (char ch : fmap.keySet()) {
            if (fmap.get(ch) > 0) {
                fmap.put(ch, fmap.get(ch) - 1);
                generateWords(cs + 1, ts, fmap, asf + ch);
                fmap.put(ch, fmap.get(ch) + 1); // backtrack
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Map<Character, Integer> fmap = new HashMap<>();

        // Build frequency map
        for (char ch : str.toCharArray()) {
            fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
        }

        generateWords(0, str.length(), fmap, "");
    }
}
