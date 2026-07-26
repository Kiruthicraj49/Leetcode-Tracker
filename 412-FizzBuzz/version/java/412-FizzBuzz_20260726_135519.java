// Last updated: 26/07/2026, 13:55:19
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max1=-1;
4        int max2= -1;
5        int mindex = -1;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i] > max1){
8                max2=max1;
9                max1=nums[i];
10                mindex=i;
11            }
12            else if(nums[i] > max2){
13                max2 = nums[i];
14            }
15        }
16        return (max1 >= 2*max2) ? mindex : -1;
17    }
18}