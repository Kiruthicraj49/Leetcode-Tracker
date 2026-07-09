// Last updated: 09/07/2026, 15:05:25
class Solution {
    public int minimumOperations(int[] nums) {
        int sum=0;
        for(int i:nums){
            int rem=i%3;
            sum=sum+Math.min(rem,3-rem);
        }
        return sum;
    }
}