// Last updated: 09/07/2026, 15:07:12
class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        String digits = "0123456789abcdef";
        String ans = "";
        while(num!=0){
            int rem = num & 15;
            ans = digits.charAt(rem)+ans;
            num = num >>>4;
        }
        return ans;
    }
}