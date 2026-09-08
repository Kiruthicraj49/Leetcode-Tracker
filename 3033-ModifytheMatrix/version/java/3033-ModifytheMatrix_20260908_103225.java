// Last updated: 08/09/2026, 10:32:25
1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        List<Integer> resultL = new ArrayList<>();
4        for(int i=0;i<nums.length;i=i+2){
5            int freq = nums[i];
6            int val = nums[i+1];
7            for(int j=0;j<freq;j++){
8                resultL.add(val);
9            }
10        }
11        int[] result = new int[resultL.size()];
12        for(int i=0;i<resultL.size();i++){
13            result[i] = resultL.get(i);
14        }
15        return result;
16    }
17}