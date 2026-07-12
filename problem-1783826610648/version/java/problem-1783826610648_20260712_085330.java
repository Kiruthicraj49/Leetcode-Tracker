// Last updated: 12/07/2026, 08:53:30
1class Solution {
2    public int secondsBetweenTimes(String starttime, String endtime) {
3        return timetoseconds(endtime) - timetoseconds(starttime);
4    }
5    private int timetoseconds(String timeStr){
6        String[] parts = timeStr.split(":");
7        int h = Integer.parseInt(parts[0]);
8        int m = Integer.parseInt(parts[1]);
9        int s = Integer.parseInt(parts[2]);
10        return (h*3600)+(m*60)+s;
11    }
12}