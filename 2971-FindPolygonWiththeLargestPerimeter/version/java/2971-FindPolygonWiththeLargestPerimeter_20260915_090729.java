// Last updated: 15/09/2026, 09:07:29
1import java.util.HashMap;
2import java.util.Map;
3class Solution {
4    public long maximumSubarraySum(int[] nums, int k) {
5        Map<Integer, Long> map = new HashMap<>();
6        long runningSum = 0;
7        long maxSum = Long.MIN_VALUE;
8        for (int num : nums) {
9            int target1 = num - k;
10            int target2 = num + k;
11            if (map.containsKey(target1)) {
12                maxSum = Math.max(maxSum, runningSum + num - map.get(target1));
13            }
14            if (map.containsKey(target2)) {
15                maxSum = Math.max(maxSum, runningSum + num - map.get(target2));
16            }
17            map.put(num, Math.min(map.getOrDefault(num, Long.MAX_VALUE), runningSum));
18
19            runningSum += num;
20        }
21        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
22    }
23}