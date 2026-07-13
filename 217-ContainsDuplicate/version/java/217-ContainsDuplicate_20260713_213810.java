// Last updated: 13/07/2026, 21:38:10
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> hs = new HashSet<>();
4        for(int num:nums){
5            if(hs.contains(num)){
6                return true;
7            }
8            hs.add(num);
9        }
10        return false;
11    }
12}