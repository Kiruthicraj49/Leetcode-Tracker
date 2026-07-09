// Last updated: 09/07/2026, 15:05:04
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        for(int i=0,j=nums.length-1;i<j;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        long[] pre = new long[k+1];
        for(int i=0;i<k;i++){
            pre[i+1] = pre[i]+nums[i];
        }
        int limit =Math.min(k,mul-1);
        long ans = pre[k];
        long mulSum=0;
        for(int x=1;x<=limit;x++){
            mulSum += 1L * nums[x-1]*(mul-(x-1));
            long addSum = pre[k] - pre[x];
            ans= Math.max(ans,mulSum+addSum);
        }
        return ans;
    }
}