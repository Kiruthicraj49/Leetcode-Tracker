// Last updated: 15/09/2026, 09:03:13
1import java.util.Arrays;
2class Solution {
3    public long largestPerimeter(int[] nums) {
4        Arrays.sort(nums);
5        long runningSum = 0;
6        long maxPerimeter = -1;
7        for (int num : nums) {
8            if (num < runningSum) {
9                maxPerimeter = runningSum + num;
10            }
11            runningSum += num;
12        }
13        return maxPerimeter;
14    }
15}