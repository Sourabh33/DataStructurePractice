package com.array.practice;

import java.util.Arrays;

public class DoubleZeroSolution {
    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeroes(arr);

        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeroesLeetCode(arr1);

        System.out.println(Arrays.toString(arr1));

    }

    private static void duplicateZeroes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                moveArrayByOne(arr, i + 1);
                i++;
            }
        }
    }

    private static void moveArrayByOne(int[] arr, int p) {
        for (int i = (arr.length - 1); i >= p; i--) {
            arr[i] = arr[i - 1];
        }
    }

    private static void duplicateZeroesLeetCode(int[] arr) {
        int possibleDups = 0;
        int size = arr.length - 1;

        for (int i = 0; i <= size - possibleDups ; i++) {
            if(arr[i] == 0) {
                if(i == size - possibleDups) {
                    arr[size] = 0;
                    size -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        System.out.println("possible duplicates: "+ possibleDups);

        int last = size - possibleDups;
        for (int i = last; i >=0; i--) {
            if(arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i+ possibleDups] = arr[i];
            }
        }
    }
}
