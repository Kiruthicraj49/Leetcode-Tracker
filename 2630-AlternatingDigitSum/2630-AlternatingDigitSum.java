// Last updated: 09/07/2026, 15:05:47
class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            int d = s.charAt(i) - '0';
            if(i%2==0){
                sum=sum+d;
            }
            else{
                sum=sum-d;
            }
        }
        return sum;
    }
}