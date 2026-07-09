// Last updated: 09/07/2026, 15:07:01
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // int n1=nums1.length;
        // int n2=nums2.length;
        // int[] ans = new int[n1];
        // for(int i=0;i<n1;i++){
        //     int f=0;
        //     ans[i] = -1;
        //     for(int j=0;j<n2;j++){
        //         if(nums1[i] == nums2[j]){
        //             f=1;
        //         }
        //         if(f==1 && nums2[j] > nums1[i]){
        //             ans[i] = nums2[j];
        //             break;
        //         }   
        //     }
        // }
        // return ans;

        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        Arrays.fill(res,-1);
        for(int x : nums2){
            while(!s.empty() && x>s.peek()){
                map.put(s.pop(),x);
            }   
            s.push(x);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                res[i] = map.get(nums1[i]);
            }
        }
        return res;
    }
}