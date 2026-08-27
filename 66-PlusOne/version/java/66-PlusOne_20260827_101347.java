// Last updated: 27/08/2026, 10:13:47
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        Set<Integer> seen = new HashSet<>();
4        for(int num:arr){
5            if(seen.contains(2*num) || (num%2==0 && seen.contains(num/2))){
6                return true;
7            }
8            seen.add(num);
9        }
10        return false;
11    }
12}