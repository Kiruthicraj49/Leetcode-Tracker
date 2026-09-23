// Last updated: 23/09/2026, 09:21:52
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n=nums.length;
4        int add=0;
5        for(int i=0;i<n;i++){
6            if(nums[i]!=0){
7                int temp = nums[i];
8                nums[i] = nums[add];
9                nums[add] = temp;
10                add++;
11            }
12        }
13    }
14}