// Last updated: 27/09/2026, 10:47:51
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        int n=nums.length;
4        List<Integer> result = new ArrayList<>();
5        Set<Integer> arr = new HashSet<>();
6        for(int num:nums){
7            arr.add(num);
8        }
9        for(int i=1;i<=n;i++){
10            if(!arr.contains(i)){
11                result.add(i);
12            }
13        }
14        return result;
15    }
16}