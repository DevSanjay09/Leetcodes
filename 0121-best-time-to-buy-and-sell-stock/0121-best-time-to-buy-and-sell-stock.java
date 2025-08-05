class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
        return 0;

        int profit = 0;
        int buyprice = prices[0];


        for(int i = 1; i<prices.length; i++){
            if(buyprice>=prices[i])
            {
                buyprice = prices[i];
            }
            profit= Math.max(profit,prices[i]-buyprice);
        }
        return profit;
        
    }
}

