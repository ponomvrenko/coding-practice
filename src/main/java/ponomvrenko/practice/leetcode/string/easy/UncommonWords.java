package ponomvrenko.practice.leetcode.string.easy;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/description/">link</a>
 *
 * <p>A sentence is a string of single-space separated words where each word consists only of lowercase letters.</p>
 *
 * <p>A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.</p>
 *
 * <p>Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.</p>
 *
 * <p></p>
 *
 * <p>Example 1:</p>
 *
 * <p>Input: s1 = "this apple is sweet", s2 = "this apple is sour"</p>
 * <p>Output: ["sweet","sour"]</p>
 * <p></p>
 *
 * <p>Example 2:</p>
 *
 * <p>Input: s1 = "apple apple", s2 = "banana"</p>
 * <p>Output: ["banana"]</p>
 *
 */

public class UncommonWords {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uncommonFromSentences("this apple is sweet", "this apple is sour")));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        String[] splittedStrings = (s1 + " " + s2).split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : splittedStrings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        List<String> strings = new ArrayList<>();
        for (Map.Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() == 1) {
                strings.add(s.getKey());
            }
        }

        return strings.toArray(new String[0]);
    }
}
