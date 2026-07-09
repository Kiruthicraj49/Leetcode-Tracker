// Last updated: 09/07/2026, 15:08:43
class Solution {
    public void sortColors(int[] nums) {
        // int zcount=0,ocount=0,tcount=0;
        // for(int x : nums){
        //     if(x==0) zcount++;
        //     else if(x==1) ocount++;
        //     else tcount++;
        // }
        // int i=0;
        // while(zcount-- > 0) nums[i++] = 0;
        // while(ocount-- > 0) nums[i++] = 1;
        // while(tcount-- > 0) nums[i++] = 2;


        int low = 0;              
        int i = 0;              
        int high = nums.length - 1; 

        while (i <= high) {
            if (nums[i] == 0) {
                int temp = nums[low];
                nums[low] = nums[i];
                nums[i] = temp;
                low++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
    