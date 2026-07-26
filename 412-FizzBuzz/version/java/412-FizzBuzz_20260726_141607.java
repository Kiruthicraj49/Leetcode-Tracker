// Last updated: 26/07/2026, 14:16:07
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] chars = s.toCharArray();
4        int left=0;
5        int right = chars.length-1;
6        while(left <  right){
7            if(!Character.isLetter(chars[left])){
8                left++;
9            }
10            else if(!Character.isLetter(chars[right])){
11                right--;
12            }
13            else{
14                char temp = chars[left];
15                chars[left] = chars[right];
16                chars[right] = temp;
17                left++;
18                right--;
19            }
20        } 
21        return new String(chars);
22    }
23}