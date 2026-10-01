// Last updated: 01/10/2026, 10:16:01
1class Solution {
2    public String multiply(String num1, String num2) {
3       if(num1.equals("0") || num2.equals("0")){
4        return "0";
5       } 
6       int m=num1.length();
7       int n=num2.length();
8       int[]  result = new int[m+n];
9       for(int i=m-1;i>=0;i--){
10        for(int j=n-1;j>=0;j--){
11            int d1=num1.charAt(i) - '0';
12            int d2=num2.charAt(j) - '0';
13            int sum = d1*d2 + result[i+j+1];
14            result[i+j+1] = sum%10;
15            result[i+j] = result[i+j] + sum/10;
16        }
17       }
18       StringBuilder sb = new StringBuilder();
19       for(int val : result){
20        if(!(sb.length()==0 && val==0)){
21            sb.append(val);
22        }
23       }
24       return sb.toString();
25    }
26}