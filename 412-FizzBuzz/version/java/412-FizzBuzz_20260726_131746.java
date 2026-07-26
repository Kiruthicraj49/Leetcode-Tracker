// Last updated: 26/07/2026, 13:17:46
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int total=0;
4        for(int num:nums){
5            total = total+num;
6        }
7        int lsum=0;
8        for(int i=0;i<nums.length;i++){
9            if(lsum == total - lsum - nums[i]){
10                return i;
11            }
12            lsum =lsum+nums[i];
13        }
14        return -1;
15    }
16}