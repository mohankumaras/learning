package com.practice.arrays;

public class MaximiseProfitFromGivenPrices {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println("Maximum profit with bruteforce is : " + maxProfitBruteForce(prices));
        System.out.println("Maximum profit with efficient method is : " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minValue = prices[0];
        int maxProfit = 0;
        for(int i=1; i<n ; i++) {
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minValue);
        }
        return maxProfit;
    }

    public static int maxProfitBruteForce(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;
        for (int i = 0; i < n-1; i++) {
            for(int j = i+1; j<n; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }
}
