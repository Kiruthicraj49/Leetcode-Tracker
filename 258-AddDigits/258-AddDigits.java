// Last updated: 09/07/2026, 15:07:27
class Solution {
    public int addDigits(int num) {
        if (num==0){
            return 0;
        }
        else if(num%9==0){
            return 9;
        }
        else{
            return (num%9);
        }
    }
}