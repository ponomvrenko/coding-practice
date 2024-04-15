package ponomvrenko.practice.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/majority-element/description/">...</a>
 *
 * <p>Majority Element</p>
 *
 * <p>Given an array nums of size n, return the majority element.</p>
 *
 * <p>The majority element is the element that appears more than ⌊n / 2⌋ times.</p>
 * You may assume that the majority element always exists in the array.</p>
 * <p></p>
 * <p>Example 1:</p>
 *
 * <p>Input: nums = [3,2,3]</p>
 * <p>Output: 3</p>
 *
 * <p></p>
 * <p>Example 2:</p>
 *
 * <p>Input: nums = [2,2,1,1,1,2,2]</p>
 * <p>Output: 2</p>
 */

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        int threshold = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> n : map.entrySet()) {
            if (n.getValue() > threshold) {
                res = n.getKey();
            }
        }
        return res;
    }
}
