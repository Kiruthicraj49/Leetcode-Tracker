// Last updated: 09/07/2026, 15:05:49
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int disum=0;
        for (int i=0;i<n;i++){
            int temp=nums[i];
            sum=sum+temp;
            while(temp>0){
                disum=disum+temp%10;
                temp=temp/10;
            }  
        }
        return Math.abs(sum - disum);
    }
}