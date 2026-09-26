// Last updated: 26/09/2026, 22:32:01
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3        int tsum = 0;
4        int currmax = 0;
5        int maxsub = nums[0];
6        int currmin = 0;
7        int minsub = nums[0];
8        for (int num : nums) {
9            tsum += num;
10            currmax = Math.max(num, currmax + num);
11            maxsub = Math.max(maxsub, currmax);
12            currmin = Math.min(num, currmin + num);
13            minsub = Math.min(minsub, currmin);
14        }
15        if (maxsub< 0) {
16            return maxsub;
17        }
18        return Math.max(maxsub, tsum - minsub);
19    }
20}