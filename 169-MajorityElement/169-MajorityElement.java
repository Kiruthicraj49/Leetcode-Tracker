// Last updated: 09/07/2026, 15:08:14
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n/2];

        // HashMap<Integer,Integer> mp = new HashMap<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // }
        // int m=n/2;
        // for(Map.Entry<Integer,Integer> en : mp.entrySet()){
        //     if(en.getValue()>m){
        //         return en.getKey();
        //     }
        // }
        // return 0;
    }
}