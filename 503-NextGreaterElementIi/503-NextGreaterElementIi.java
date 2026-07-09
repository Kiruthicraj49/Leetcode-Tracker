// Last updated: 09/07/2026, 15:07:00
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int n=nums.length;
        // int[] ans = new int[n*2];
        // for(int i=0;i<n;i++){
        //     ans[i] = ans[i+n] = nums[i];
        // }
        // int[] da = new int[n];
        // for(int i=0;i<n;i++){
        //     da[i] = -1;
        //     for(int j=i+1;j<ans.length;j++){
        //         if(nums[i] < ans[j]){
        //             da[i] = ans[j];
        //             break;
        //         }
        //     }
        // }
        // return da;

        // int n=nums.length;
        // int[] ans =new int [n];
        // for(int i=0;i<n;i++){
        //     ans[i] = -1;
        //     for(int j=1;j<n;j++){
        //         if(nums[(i+j)%n] > nums[i]){
        //             ans[i] = nums[(i+j)%n];
        //             break;
        //         }
        //     }
        // }
        // return ans;



        int n=nums.length;
        Stack <Integer> s = new Stack<>();
        int[] res = new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n*2;i++){
            int x=nums[i%n];
            while(!s.empty() && x>nums[s.peek()]){
                res[s.pop()] = x;
            }
            s.push(i%n);
        }
        return res;
    }
}