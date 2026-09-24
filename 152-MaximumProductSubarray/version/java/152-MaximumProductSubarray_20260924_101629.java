// Last updated: 24/09/2026, 10:16:29
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n=nums.length;
4        int max=nums[0];
5        for(int i=0;i<n;i++){
6            int pro=1;
7            for(int j=i;j<n;j++){
8                pro = pro * nums[j];
9                if(pro>max){
10                    max=pro;
11                }
12            }
13        }
14        return max;
15    }
16}