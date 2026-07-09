// Last updated: 09/07/2026, 15:05:01
class Solution {
    public int maxDigitRange(int[] nums) {
        int[] n=nums;
        int range=-1;
        int sum=0;
        for(int num:n){
            int curr = getDigit(num);
            if(curr>range){
                range = curr;
                sum=num;
            }
            else if(curr == range){
                sum=sum+num;
            }
        }
        return sum;
    }
    public int getDigit(int num){
        int max=0;
        int min=9;
        while(num>0){
            int digit  = num %10;
            if(digit>max){
                max=digit;
            }
            if(digit < min){
                min=digit;
            }
            num=num/10;
        }
        return max-min;
    }
}