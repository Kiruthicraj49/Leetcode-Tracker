// Last updated: 13/07/2026, 12:43:10
class Solution {
    public int secondsBetweenTimes(String starttime, String endtime) {
        return timetoseconds(endtime) - timetoseconds(starttime);
    }
    private int timetoseconds(String timeStr){
        String[] parts = timeStr.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return (h*3600)+(m*60)+s;
    }
}