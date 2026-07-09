// Last updated: 09/07/2026, 15:07:06
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b) -> a[1] - b[1]);
        int end = intervals[0][1];
        int count =0;
        for(int i=1;i<n;i++){
            if(intervals[i][0] < end ){
                count=count+1;
            }
            else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}