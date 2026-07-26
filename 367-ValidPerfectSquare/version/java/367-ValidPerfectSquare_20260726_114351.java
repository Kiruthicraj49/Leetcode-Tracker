// Last updated: 26/07/2026, 11:43:51
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        long left=1;
4        long right = num;
5        while(left <= right){
6            long mid = left+(right - left)/2;
7            long sq = mid*mid;
8            if(sq==num){
9                return true;
10            }
11            else if(sq < num){
12                left = mid+1;
13            }
14            else{
15                right=mid-1;
16            }
17        }
18        return false;
19    }
20}