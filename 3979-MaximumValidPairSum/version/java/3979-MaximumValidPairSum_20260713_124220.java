// Last updated: 13/07/2026, 12:42:20
1class Solution {
2    public int maxValidPairSum(int[] nums, int k) {
3        int maxsum=-1;
4        int max=-1;
5        for(int j=k;j<nums.length;j++){
6            max = Math.max(max,nums[j-k]);
7            maxsum = Math.max(maxsum,max+nums[j]);
8        }
9        return maxsum;
10    }
11}