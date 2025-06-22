package com.practice.arrays;

public class MaximumProductOfAnArray {
    public static void main(String[] args) {
        int[] arr = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));
    }

    public static long maxProduct(int[] inp) {
        int n = inp.length;
        long currMin = inp[0];
        long currMax = inp[0];
        long product = inp[0];
        for (int i=1; i<n;i++) {
            long temp = max(inp[i], inp[i] * currMax, inp[i] * currMin);
            currMin = min(inp[i], inp[i] * currMax, inp[i] * currMin);
            currMax = temp;
            product = Math.max(product, currMax);
        }
        return product;
    }

    public static long max(long a, long b, long c) {
        return Math.max(a, Math.max(b,c));
    }

    public static long min(long a, long b, long c) {
        return Math.min(a, Math.min(b,c));
    }
}
