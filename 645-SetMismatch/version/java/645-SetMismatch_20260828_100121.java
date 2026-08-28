// Last updated: 28/08/2026, 10:01:21
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n=nums.length;
4        int[] result = new int[n];
5        int left=0;
6        int right = n-1;
7        for(int num:nums){
8            if(num%2==0){
9                result[left]=num;
10                left++;
11            }
12            else{
13                result[right]=num;
14                right--;
15            }
16        }
17        return result;
18    }
19}