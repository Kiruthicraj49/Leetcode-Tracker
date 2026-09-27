// Last updated: 27/09/2026, 10:59:41
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder sb = new StringBuilder();
4        int len=s.length();
5        for(int i=0;i<len;i++){
6            char c = s.charAt(i);
7            if(Character.isLetterOrDigit(c)){
8                sb.append(Character.toLowerCase(c));
9            }
10        }
11        int left=0;
12        int right = sb.length() - 1;
13        while(left<right){
14            if(sb.charAt(left) != sb.charAt(right)){
15                return false;
16            }
17            left++;
18            right--;
19        }
20        return true;
21    }
22}