// Last updated: 09/07/2026, 15:07:17
class Solution {
    public int firstUniqChar(String s) {
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     boolean ans=true;
        //     for(int j=0;j<n;j++){
        //         if(i!=j && s.charAt(i) == s.charAt(j)){
        //             ans=false;
        //             break;
        //         }
        //     }
        //     if(ans==true) return i;
        // }
        // return -1;

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i) - 97;
            freq[idx]++;
        }
        for(int i=0;i<s.length();i++){
            int idx=s.charAt(i) - 97;
            if(freq[idx]==1) return i;
        }
        return -1;
    }
}