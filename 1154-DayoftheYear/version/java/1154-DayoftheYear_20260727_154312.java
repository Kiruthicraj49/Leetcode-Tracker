// Last updated: 27/07/2026, 15:43:12
1class Solution {
2    public double myPow(double x, int n) {
3        long N=n;
4        if(N<0){
5            x=1/x;
6            N= -N;
7        }
8        double result = 1.0;
9        while(N>0){
10            if(N%2==1){
11                result = result*x;
12            }
13            x=x*x;
14            N=N/2;
15        }
16        return result;
17    }
18}