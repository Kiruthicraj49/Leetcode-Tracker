// Last updated: 26/07/2026, 16:26:38
1class Solution {
2    public int maxProduct(int n) {
3        int max1=0;
4        int max2=0;
5        while(n>0){
6            int digit = n%10;
7            if(digit>=max1){
8                max2=max1;
9                max1=digit;
10            }
11            else if(digit>max2){
12                max2=digit;
13            }
14            n=n/10;
15        }
16        return max1*max2;
17    }
18}