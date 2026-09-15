// Last updated: 15/09/2026, 09:09:57
1import java.util.HashSet;
2import java.util.Set;
3class Solution {
4    public int maximumSetSize(int[] nums1, int[] nums2) {
5        int n = nums1.length;
6        int limit = n / 2;
7        Set<Integer> s1 = new HashSet<>();
8        Set<Integer> s2 = new HashSet<>();
9        for (int num : nums1) s1.add(num);
10        for (int num : nums2) s2.add(num);
11        Set<Integer> common = new HashSet<>(s1);
12        common.retainAll(s2);
13        int only1 = s1.size() - common.size();
14        int only2 = s2.size() - common.size();
15        int count1 = Math.min(only1, limit);
16        int count2 = Math.min(only2, limit);
17        int rem1 = limit - count1;
18        int rem2 = limit - count2;
19        int commonCount = Math.min(common.size(), rem1 + rem2);
20        return count1 + count2 + commonCount;
21    }
22}