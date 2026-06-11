class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;      // Buy day
        int right = 1;     // Sell day
        int maxProfit = 0;

        while (right < prices.length) {

            if (prices[right] > prices[left]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                left = right; // Found cheaper buy price
            }

            right++;
        }

        return maxProfit;
    }
}