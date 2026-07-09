// Last updated: 09/07/2026, 15:08:17
class Solution {
    public int[] twoSum(int[] num, int target) {
        int left=0;
        int right = num.length-1;
        while(left<right){
            int sum=num[left] + num[right];
            if(sum==target){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}