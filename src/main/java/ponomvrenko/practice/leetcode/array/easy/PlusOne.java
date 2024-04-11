package ponomvrenko.practice.leetcode.array.easy;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/plus-one/description/">...</a>
 *
 * <p>You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.</p>
 *
 * <p>Increment the large integer by one and return the resulting array of digits.</p>
 *
 * <p>Ex. 1
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.</p>
 *
 * <p>Ex. 2
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.</p>
 */

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
