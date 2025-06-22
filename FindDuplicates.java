package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {

    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int[] freq = new int[arr.length];
        for(int elem : arr)
            freq[elem]++;
        for (int i=0;i<arr.length;i++) {
            if(freq[arr[i]] > 1) {
                result.add(arr[i]);
                freq[arr[i]] = 0;
            }

        }
        return result;
    }
}
