// Last updated: 09/07/2026, 15:05:28
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp=x;
        while(x!=0){
            int d=x%10;
            sum=sum+d;
            x=x/10;
        }
        return temp%sum==0 ? sum:-1;
    }
}