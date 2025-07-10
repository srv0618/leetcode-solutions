// Last updated: 09/07/2025, 22:53:56
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int cheapestPrice = prices[0];

        for( int i=0;i<prices.length;i++){
            if(prices[i]<cheapestPrice)
                cheapestPrice=prices[i];

            maxProfit=Math.max(maxProfit,prices[i]-cheapestPrice);
        }

        return maxProfit;
    }
}