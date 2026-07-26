// Last updated: 26/07/2026, 13:00:53
1class Solution {
2    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
3        int states = (minutesToTest / minutesToDie) + 1;
4        int pigs = 0;
5        int maxBuckets = 1;
6        while(maxBuckets < buckets){
7            maxBuckets = maxBuckets*states;
8            pigs++;
9        }
10        return pigs;
11    }
12}