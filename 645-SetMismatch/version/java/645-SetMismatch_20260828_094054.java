// Last updated: 28/08/2026, 09:40:54
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n=nums.length;
4        int[] count = new int[n+1];
5        int dup= -1;
6        int miss= -1;
7        for(int num:nums){
8            count[num]++;
9        }
10        for(int i=1;i<=n;i++){
11            if(count[i]==2){
12                dup=i;
13            }
14            else if(count[i]==0){
15                miss=i;
16            }
17        }
18        return new int[] {dup,miss};
19    }
20}