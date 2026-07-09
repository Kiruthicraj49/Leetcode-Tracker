// Last updated: 09/07/2026, 15:07:14
class Solution {
    public char findTheDifference(String s, String t) {
        // char[] a = s.toCharArray();
        // char[] b = t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // for(int i=0;i<a.length;i++){
        //     if(a[i] != b[i]) return b[i];
        // }
        // return b[b.length-1];


        // int res=0;
        // for(int i=0;i<t.length();i++){
        //     res=res+t.charAt(i);
        // }
        // for(int i=0;i<s.length();i++){
        //     res = res - s.charAt(i);
        // }
        // return (char)res;

        int sSum=0,tSum=0;
        for(int i=0;i<s.length();i++){
            sSum = sSum + s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            tSum = tSum + t.charAt(i);
        }
        return (char)(tSum-sSum);
    }
}