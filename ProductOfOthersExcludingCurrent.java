package com.practice.arrays;

import java.util.Arrays;

public class ProductOfOthersExcludingCurrent {
    public static void main(String[] args) {
        int[] input = {10, 3, 5, 6, 2};
        System.out.println("Product array is : " + Arrays.toString(product(input)));
        int[] input2 = {12, 0};
        System.out.println("Product array is : " + Arrays.toString(product(input2)));
        int[] input3 = {12, 0, 0};
        System.out.println("Product array is : " + Arrays.toString(product(input3)));
    }

    public static int[] product(final int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int zeroes = 0;
        int zeroIndex = -1;
        int product = 1;
        for(int i = 0; i<n; i++) {
            if(arr[i] == 0){
                zeroIndex = i;
                zeroes++;
            } else {
                product *= arr[i];
            }
        }
        Arrays.fill(res,0);
        if(zeroes == 0) {
            for (int i=0;i<n;i++)
                res[i] = product/arr[i];

        } else if(zeroes==1){
            res[zeroIndex] = product;
        }
        return res;
    }
}