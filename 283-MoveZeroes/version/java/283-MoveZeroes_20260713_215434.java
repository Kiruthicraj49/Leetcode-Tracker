// Last updated: 13/07/2026, 21:54:34
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> hs = new HashSet<>();
4        HashSet<Integer> hs1 = new HashSet<>();
5        for(int num:nums1){
6            hs.add(num);
7        }
8        for(int num:nums2){
9            if(hs.contains(num)){
10                hs1.add(num);
11            }
12        }
13        int[] result = new int[hs1.size()];
14        int index=0;
15        for(int num:hs1){
16            result[index++]=num;
17        }
18        return result;
19    }
20}