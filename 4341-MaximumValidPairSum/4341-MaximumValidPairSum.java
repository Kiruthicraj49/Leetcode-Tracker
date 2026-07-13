// Last updated: 13/07/2026, 12:43:22
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxsum=-1;
        int max=-1;
        for(int j=k;j<nums.length;j++){
            max = Math.max(max,nums[j-k]);
            maxsum = Math.max(maxsum,max+nums[j]);
        }
        return maxsum;
    }
}