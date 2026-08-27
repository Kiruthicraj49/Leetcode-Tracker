// Last updated: 27/08/2026, 10:33:19
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum=nums[0];
4        for(int i=1;i<nums.length;i++){
5            if(nums[i]==nums[i-1]+1){
6                sum=sum+nums[i];
7            }
8            else{
9                break;
10            }
11        }
12        while(contains(nums,sum)){
13            sum++;
14        }
15        return sum;
16    }
17    private boolean contains(int[] nums,int target){
18        for(int num:nums){
19            if(num==target){
20                return true;
21            }
22        }
23        return false;
24    }
25}