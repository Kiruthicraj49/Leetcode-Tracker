// Last updated: 09/07/2026, 15:05:03
class Solution {
    public int maxDistance(String moves) {
        int n=moves.length();
        int up=0,down=0,r=0,l=0,blank=0;
        for(char ch : moves.toCharArray()){
            if(ch=='U') up++;
            else if(ch=='D') down++;
            else if(ch=='R') r++;
            else if(ch=='L') l++;
            else blank++;
        }
        return Math.abs(up-down) + Math.abs(l-r) + blank;
    }
}