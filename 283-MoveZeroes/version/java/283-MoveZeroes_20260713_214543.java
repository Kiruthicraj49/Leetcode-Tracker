// Last updated: 13/07/2026, 21:45:43
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n=nums.length;
4        int insert=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]!=0){
7                int temp=nums[i];
8                nums[i] = nums[insert];
9                nums[insert] = temp;
10                insert++;
11            }
12        }
13    }
14}