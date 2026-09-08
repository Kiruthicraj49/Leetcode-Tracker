// Last updated: 08/09/2026, 12:33:49
1class Solution {
2    public int findMaxLength(int[] nums) {
3        Map<Integer,Integer> map = new HashMap<>();
4        map.put(0,-1);
5        int sum=0;
6        int length=0;
7        for(int i=0;i<nums.length;i++){
8            sum += (nums[i] == 1) ? 1 : -1;
9            if(map.containsKey(sum)){
10                int len = i - map.get(sum);
11                length = Math.max(length,len);
12            }
13            else{
14                map.put(sum,i);
15            }
16        }
17        return length;
18    }
19}