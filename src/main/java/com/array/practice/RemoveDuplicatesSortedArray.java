package com.array.practice;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    /**
     * Problem Statement
     * Example 1
     * <p>
     * Input:
     * nums = [1,1,2]
     * <p>
     * Output: 2, nums = [1,2,_]
     * <p>
     * Explanation: function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     * <p>
     * <p>
     * Example 2
     * <p>
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * <p>
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * <p>
     * Explanation: function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    public static void main(String[] args) {
        // Sorted Array
        int[] nums = {1, 1, 2};
        System.out.printf("Input array: %s%n", Arrays.toString(nums)); // Input array: [1, 1, 2]
        int output = removeDuplicates(nums);
        System.out.printf("Output array: %s%n", Arrays.toString(nums)); // Output array: [1, 2, 2]
        System.out.printf("Output: %d%n", output); // Output: 2

        // Sorted Array
        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.printf("Input array: %s%n", Arrays.toString(nums1)); // Input array: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        int output1 = removeDuplicates(nums1);
        System.out.printf("Output array: %s%n", Arrays.toString(nums1)); // Output array: [0, 1, 2, 3, 4, 2, 2, 3, 3, 4]
        System.out.printf("Output: %d%n", output1); // Output: 5

    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) return n;

        int j = 0;
        for (int i = 0; i < (n - 1); i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }

        nums[j++] = nums[n - 1];
        return j;
    }
}
