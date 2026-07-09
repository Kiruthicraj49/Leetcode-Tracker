// Last updated: 09/07/2026, 15:06:12
class Solution {
    public int maximumUnits(int[][] boxtype, int trucksize) {
        Arrays.sort(boxtype, (a,b) -> b[1] - a[1]);
        int ans=0;
        for (int i=0;i<boxtype.length;i++){
            int num = boxtype[i][0];
            int q=boxtype[i][1];                                   
            int box = Math.min(num,trucksize);
            trucksize = trucksize - box;
            ans= ans+box*q;
        }
        return ans;
    }
}