// Last updated: 05/08/2026, 05:31:16
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        Set<Integer> numset = new HashSet<>();
4        int min = Integer.MAX_VALUE;
5        int max = Integer.MIN_VALUE;
6        for(int num: nums){
7            numset.add(num);
8            if(num < min) min=num;
9            if(num > max) max = num;
10        }
11        List<Integer> missing = new ArrayList<>();
12        for(int i =min;i<=max;i++){
13            if(!numset.contains(i)){
14                missing.add(i);
15            }
16        }
17        return missing;
18    }
19}