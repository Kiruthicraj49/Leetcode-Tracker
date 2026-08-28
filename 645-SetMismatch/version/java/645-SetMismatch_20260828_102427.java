// Last updated: 28/08/2026, 10:24:27
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int n=nums.length;
4        int[] result = new int[n];
5        int even=0;
6        int odd=1;
7        for(int num:nums){
8            if(num%2==0){
9                result[even]=num;
10                even=even+2;
11            }
12            else{
13                result[odd]=num;
14                odd=odd+2;
15            }
16        }
17        return result;
18    }
19}