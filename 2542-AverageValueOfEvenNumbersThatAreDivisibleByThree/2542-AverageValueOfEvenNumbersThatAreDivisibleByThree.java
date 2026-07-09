// Last updated: 09/07/2026, 15:05:55
class Solution {
    public int averageValue(int[] nums) {
        int n=nums.length;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                if (nums[i]%3==0){
                    sum=sum+nums[i];
                    count++;
                }
            }
        }
        if(count==0){
            return 0;
        } else {
            return sum/count;
        }

    }

}