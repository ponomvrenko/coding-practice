package ponomvrenko.practice.leetcode.array.medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/shortest-unsorted-continuous-subarray/description/">Link</a>
 *
 * <p>Given an integer array nums, you need to find one continuous subarray such that if you only sort
 * this subarray in non-decreasing order, then the whole array will be sorted in non-decreasing order.
 * <p>Return the shortest such subarray and output its length.</p>
 * <p></p>
 * <p>Example 1:</p>
 *
 * <p>Input: nums = [2,6,4,8,10,9,15]</p>
 * <p>Output: 5</p>
 * <p>Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.</p>
 *
 * <p></p>
 * <p>Example 2:</p>
 *
 * <p>Input: nums = [1,2,3,4]</p>
 * <p>Output: 0</p>
 */

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[] {2,6,4,8,10,9,15})); // 5
        /*System.out.println(findUnsortedSubarray(new int[] {1, 2, 3, 4})); // 0
        System.out.println(findUnsortedSubarray(new int[] {1})); // 0
        System.out.println(findUnsortedSubarray(new int[] {1, 2})); // 0
        System.out.println(findUnsortedSubarray(new int[] {2, 1})); // 2
        System.out.println(findUnsortedSubarray(new int[] {5,4,3,2,1})); // 5*/
        //System.out.println(findUnsortedSubarray(new int[]{1, 3, 2, 3, 3})); // 2
    }

    /*public static int findUnsortedSubarray(int[] nums) {
        // find subarray
        int firstPositionIndex = 0;
        int lastPositionIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                firstPositionIndex = i - 1;
                for (int j = firstPositionIndex + 1; j < nums.length; j++) {
                    if (nums[j - 1] >= nums[j]) {
                        lastPositionIndex = j;
                    }
                }
                break;
            }
        }

        // in 2 length array situation
        if (firstPositionIndex == 0 && lastPositionIndex == 1) {
            return 2;
        }

        if (firstPositionIndex == 0 && lastPositionIndex != 0) {
            lastPositionIndex++;
        }

        return lastPositionIndex;
    }*/

    public static int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max > nums[i]) { // the left value is greater then current value
                end = i; // mark that index with end
            } else {
                max = nums[i];
            }
        }

        int start = 0;
        int min = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (min < nums[i]) { // the right value is smaller then current value
                start = i; // mark that index with start
            } else {
                min = nums[i];
            }
        }

        return end - start + 1;
    }
}
