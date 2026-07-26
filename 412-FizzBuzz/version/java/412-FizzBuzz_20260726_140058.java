// Last updated: 26/07/2026, 14:00:58
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        boolean[] isjewel = new boolean[128];
4        for(char j:jewels.toCharArray()){
5            isjewel[j] = true;
6        }
7        int count=0;
8        for(char s : stones.toCharArray()){
9            if(isjewel[s]){
10                count++;
11            }
12        }
13        return count;
14    }
15}