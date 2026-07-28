// Last updated: 28/07/2026, 21:00:32
1class Solution {
2    public String smallestPalindrome(String s) {
3        int n = s.length();
4        int halfLen = n / 2;
5        char[] half = s.substring(0, halfLen).toCharArray();
6        Arrays.sort(half);
7        String left = new String(half);
8        String middle = (n % 2 != 0) ? String.valueOf(s.charAt(halfLen)) : "";
9        String right = new StringBuilder(left).reverse().toString();
10        return left + middle + right;
11    }
12}