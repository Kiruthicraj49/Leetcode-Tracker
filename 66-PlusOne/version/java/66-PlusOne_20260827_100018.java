// Last updated: 27/08/2026, 10:00:18
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n=nums.length;
4        int[] temp = new int[n];
5        for(int i=0;i<n;i++){
6            temp[(i+k)%n] = nums[i];
7        }
8        System.arraycopy(temp,0,nums,0,n);
9    }
10}