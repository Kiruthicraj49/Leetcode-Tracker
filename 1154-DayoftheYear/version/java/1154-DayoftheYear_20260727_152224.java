// Last updated: 27/07/2026, 15:22:24
1class Solution {
2    public int dayOfYear(String date) {
3        int year = Integer.parseInt(date.substring(0,4));
4        int month = Integer.parseInt(date.substring(5,7));
5        int day = Integer.parseInt(date.substring(8,10));
6        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
7        int totalDays = day;
8        for(int i=0;i<month-1;i++){
9            totalDays = totalDays + daysInMonth[i];
10        }
11        if(month >2 && isLeapYear(year)){
12            totalDays = totalDays+1;
13        }
14        return totalDays;
15    }
16    private boolean isLeapYear(int year){
17        return (year%4==0 && year%100!=0) || (year%400==0);
18    }
19}