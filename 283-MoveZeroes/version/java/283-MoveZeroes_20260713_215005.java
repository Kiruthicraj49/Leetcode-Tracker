// Last updated: 13/07/2026, 21:50:05
1class Solution {
2    public void reverseString(char[] s) {
3        int r=s.length-1;
4        int l=0;
5        while(l<r){
6            char temp=s[l];
7            s[l] = s[r];
8            s[r] = temp;
9            l++;
10            r--;
11        }
12    }
13}