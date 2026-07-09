// Last updated: 09/07/2026, 15:07:23
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totalsums=n*(n+1)/2;
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        return totalsums-sum;
    }
}