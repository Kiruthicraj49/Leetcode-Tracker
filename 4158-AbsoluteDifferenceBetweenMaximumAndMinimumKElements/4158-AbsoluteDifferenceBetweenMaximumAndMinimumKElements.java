// Last updated: 09/07/2026, 15:05:14
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum_l=0;
        int sum_s=0;
        for(int i=0;i<k;i++){
            sum_s=sum_s+nums[i];
        }
        for(int i=n-k;i<n;i++){
            sum_l=sum_l+nums[i];
        }
        return Math.abs(sum_l - sum_s);
    }
}