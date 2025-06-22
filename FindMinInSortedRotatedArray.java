package com.practice.arrays;

public class FindMinInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 1, 2, 3, 4};
       // System.out.println(findMinBF(arr));
        System.out.println(findMinBinSrch(arr));
    }

    public static int findMinBF(int[] array) {
        int result = array[0];
        for(int i=1;i<array.length;i++) {
            result = Math.min(result,array[i]);
        }
        return result;
    }

    public static int findMinBinSrch(int[] array) {
        int low = 0;
        int high = array.length-1;
        while (low < high) {
            if(array[low] < array[high])
                return array[low];
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high])
                low = mid + 1;
            else
                high = mid;
        }
        return array[low];
    }
}
