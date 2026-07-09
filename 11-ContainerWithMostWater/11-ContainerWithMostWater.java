// Last updated: 09/07/2026, 15:09:10
class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length - 1;
        int ans=0;
        while (i<j){
            int he=Math.min(h[i],h[j]);
            int w = j-i;
            int area =  he*w;
            if(area > ans){
                ans=area;
            }
            if(h[i] < h[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return ans;
    }
}