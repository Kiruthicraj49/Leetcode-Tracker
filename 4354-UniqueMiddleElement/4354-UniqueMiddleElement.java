// Last updated: 09/07/2026, 15:05:08
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int mid=nums[n/2];
        int count=0;
        for(int num:nums){
         if(num==mid){
            count++;
         }   
        }
        return count==1;
    }
}