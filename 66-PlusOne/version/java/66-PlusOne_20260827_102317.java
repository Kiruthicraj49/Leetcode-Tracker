// Last updated: 27/08/2026, 10:23:17
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3        Map<Integer,Integer> freq = new HashMap<>();
4        int max=0;
5        int total=0;
6        for(int num:nums){
7            int count = freq.getOrDefault(num,0) + 1;
8            freq.put(num,count);
9            if(count>max){
10                max=count;
11                total=count;
12            }
13            else if(count==max){
14                total = total+count;
15            }
16        }
17        return total;
18    }
19}