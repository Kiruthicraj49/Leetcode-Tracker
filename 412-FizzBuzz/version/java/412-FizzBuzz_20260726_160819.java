// Last updated: 26/07/2026, 16:08:19
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n =nums.length;
4        int[] result = new int[n];
5        int left=0;
6        int right = n-1;
7        int index =n-1;
8        while(left<=right){
9            int leftsq = nums[left] * nums[left];
10            int rightsq = nums[right] * nums[right];
11            if(leftsq > rightsq){
12                result[index] = leftsq;
13                left++;
14            }
15            else{
16                result[index] = rightsq;
17                right--;
18            }
19            index--;
20        }
21        return result;
22    }
23}