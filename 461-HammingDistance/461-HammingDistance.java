// Last updated: 09/07/2026, 15:07:03
class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int count=0;
        while(xor!=0){
            count=(count + (xor&1));
            xor = xor >> 1;
        }
        return count;
    }
}