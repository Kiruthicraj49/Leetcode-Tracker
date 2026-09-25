// Last updated: 25/09/2026, 10:10:36
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        int n=nums.length;
4        if(n==0){
5            return 0;
6        }
7        Arrays.sort(nums);
8        int max=1;
9        int curr=1;
10        for(int i=1;i<n;i++){
11            if(nums[i] == nums[i-1]){
12                continue;
13            }
14            if(nums[i] == nums[i-1]+1){
15                curr++;
16            }
17            else{
18                curr=1;
19            }
20            max=Math.max(max,curr);
21        }
22        return max;
23    }
24}