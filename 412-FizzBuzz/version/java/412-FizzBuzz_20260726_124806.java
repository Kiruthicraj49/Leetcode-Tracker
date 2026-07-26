// Last updated: 26/07/2026, 12:48:06
1class Solution {
2    public int thirdMax(int[] nums) {
3        Long max1=null;
4        Long max2=null;
5        Long max3=null;
6        for(int num:nums){
7            long n=num;
8            if((max1 != null && max1 == n)||
9            (max2 !=null && max2 == n) ||
10            (max3 != null && max3 == n)){
11                continue;
12            }
13            if(max1== null || n>max1){
14                max3=max2;
15                max2=max1;
16                max1=n;
17            }
18            else if(max2 == null || n> max2){
19                max3 =max2;
20                max2=n;
21            }
22            else if(max3 == null || n>max3){
23                max3=n;
24            }
25        }
26        return max3==null ? max1.intValue() : max3.intValue();
27    }
28}