// Last updated: 09/07/2026, 15:05:17
class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int v=0;
        int c=0;
        for(int i=0;i<26;i++){
            char ch = (char)(i+'a');
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v=Math.max(v,freq[i]);
            }
            else{
                c=Math.max(c,freq[i]);
            }
        }
        return v+c;
    }
}