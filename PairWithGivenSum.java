package practice.dsa.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int target = -2;
        //System.out.println(withHashSet(arr,target));
        System.out.println(withBinarySearch(arr,target));
    }
    public static boolean withHashSet(int[] array, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int current : array) {
            int complement = target - current;
            if(set.contains(complement)) {
                System.out.println("Pair found : `" + current + "` and `" + complement + "`");
                return true;
            }
            set.add(current);
        }
        return false;
    }

    public static boolean withBinarySearch(int[] array, int target) {
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
            int complement = target - array[i];
            if(binarySearch(array,i+1,array.length-1,complement) != -1) {
                System.out.println("Pair found : `" + array[i] + "` and `" + complement + "`");
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] array,int left, int right, int target) {
        if(left <= right) {
            int mid = left + (right - left)/2;
           //int mid = (left + right)/2;
            if(array[mid] == target)
                return mid;
            if(array[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
            return binarySearch(array,left,right,target);
        }
        return -1;
    }
}
