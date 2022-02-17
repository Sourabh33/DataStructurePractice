package com.array.practice;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println("result: " + removeElements(nums, val));
    }

    private static int removeElements(int[] arr, int val) {
        int i = 0;

        int size = arr.length - 1;

        for (int j = 0; j < size; j++) {
            if(arr[j] != val) {
                arr[i] = arr[j];
                i++;
            }
        }

        return i;
    }
}
