// Last updated: 09/07/2026, 15:06:58
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        return sum==num ? true:false;
    }
}