class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0;i<prices.length;i++){
            int current_price = prices[i];

            if(current_price < min_price){
                min_price = current_price;
            }

            int profit = current_price - min_price;

            if(profit > max_profit){
                max_profit = profit;
            }
        }

        return max_profit;
    }
}