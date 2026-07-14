package Batch_6;

public class BuySell {
    public static void main(String[] args) {
        //https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        int[] arr = { 7, 6, 4, 1,3 };
        int minPrice = arr[0];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }

            int profit = arr[i] - minPrice;

            if (profit > max) {
                max = profit;
            }
        }
        System.out.println(max);
    }
}
