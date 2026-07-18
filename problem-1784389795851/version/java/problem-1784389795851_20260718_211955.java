// Last updated: 18/07/2026, 21:19:55
1class Solution {
2    public String rearrangeString(String s, char x, char y) {
3        StringBuilder yu = new StringBuilder(); 
4        StringBuilder xc = new StringBuilder();
5        StringBuilder other = new StringBuilder();
6        for(int i=0;i<s.length();i++){
7            char c = s.charAt(i);
8            if(c==y){
9                yu.append(c);
10            }
11            else if(c==x){
12                xc.append(c);
13            }
14            else{
15                other.append(c);
16            }
17        }
18        return yu.append(other).append(xc).toString();
19    }
20}