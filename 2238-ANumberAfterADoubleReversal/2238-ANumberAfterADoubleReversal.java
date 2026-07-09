// Last updated: 09/07/2026, 15:06:01
class Solution {
    public boolean isSameAfterReversals(int num) {
       if (num==0){
        return true;
       }
       else
       return num % 10 !=0;
    }
}