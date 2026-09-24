// Last updated: 24/09/2026, 10:21:10
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n=nums.length;
4        Set<Integer> set = new HashSet<>();
5        for(int num:nums){
6            if(set.contains(num)){
7                return num;
8            }
9            set.add(num);
10        }
11        return -1;
12    }
13}