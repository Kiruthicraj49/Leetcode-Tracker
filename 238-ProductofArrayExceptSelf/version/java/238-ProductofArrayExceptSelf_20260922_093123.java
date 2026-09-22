// Last updated: 22/09/2026, 09:31:23
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] res = new int[n];
5        int leftpro=1;
6        for(int i=0;i<n;i++){
7            res[i] = leftpro;
8            leftpro = leftpro * nums[i];
9        }
10        int rightpro=1;
11        for(int i=n-1;i>=0;i--){
12            res[i] = res[i] * rightpro;
13            rightpro = rightpro * nums[i];
14        }
15        return res;
16    }
17}