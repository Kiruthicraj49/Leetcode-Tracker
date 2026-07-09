// Last updated: 09/07/2026, 15:05:27
class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
            sum=sum + diff;
        }
        return sum;
    }
}