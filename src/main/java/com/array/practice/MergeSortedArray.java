package com.array.practice;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] m = {1,2,3,0,0,0};
        int[] n = {4,5,6};
        mergeSortArray(m, getElementsSize(m), n, n.length);
        System.out.println(Arrays.toString(m));
    }

    private static int getElementsSize(int[] m) {
        int counter = 0;
        for (int i = 0; i < m.length; i++) {
            if(m[i] != 0) {
                counter++;
            }
        }
        return counter;
    }

    private static void mergeSortArray(int[] arr1, int l1, int[] arr2, int l2) {
        for (int i = 0; i < l2; i++) {
            arr1[l1 + i] = arr2[i];
        }
    }
}
