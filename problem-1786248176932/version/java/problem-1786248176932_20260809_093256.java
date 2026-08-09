// Last updated: 09/08/2026, 09:32:56
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int n=prices.length;
6        int m=discounts.length;
7        double totalcost=0.0;
8        int k=Math.min(n,m);
9        for(int i=0;i<k;i++){
10            int price = prices[n-1-i];
11            int discount=discounts[m-1-i];
12            totalcost=totalcost+ price*(100.0-discount)/100.0;
13        }
14        for(int i=0;i<n-k;i++){
15            totalcost=totalcost+prices[i];
16        }
17        return totalcost;
18    }
19}