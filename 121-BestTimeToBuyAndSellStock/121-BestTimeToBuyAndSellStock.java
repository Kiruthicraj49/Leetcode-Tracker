// Last updated: 09/07/2026, 15:08:33
class Solution {
    public int maxProfit(int[] prices) {
        // int n= prices.length;
        // int maxp=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int cp=prices[j] - prices[i];
        //         if(maxp<cp){
        //             maxp=cp;
        //         }
        //     }
        // }
        // return maxp;


        int n=prices.length;
        int maxp=0;
        int minbuyprice = prices[0];
        for(int i=1;i<n;i++){
            int sellprice=prices[i];
            if(sellprice > minbuyprice){
                int profit = sellprice - minbuyprice;
                if(profit > maxp){
                    maxp = profit;
                }
            }
            else{
                minbuyprice = sellprice;
            }
        }
        return maxp;
    }
}