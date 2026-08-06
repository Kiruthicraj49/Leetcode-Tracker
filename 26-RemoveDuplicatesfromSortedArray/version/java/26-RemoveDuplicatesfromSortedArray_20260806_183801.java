// Last updated: 06/08/2026, 18:38:01
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length==0) return 0;
4        int write=1;
5        for(int read =1;read < nums.length;read++){
6            if(nums[read] != nums[read-1]){
7                nums[write] = nums[read];
8                write++;
9            }
10        }
11        return write;
12    }
13}