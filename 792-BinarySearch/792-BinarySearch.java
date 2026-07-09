// Last updated: 09/07/2026, 15:06:44
class Solution {
    public int search(int[] nums, int target) {
        // int n=nums.length;
        // for (int i=0;i<n;i++){
        //     if(target==nums[i]){
        //         return i;
        //     }
        // }
        // return -1;

        int n=nums.length;
        int i=0;
        int j=n-1;
        int mid;
        while(i<=j){
            mid=(i+j)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid] < target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return -1;
    }
}