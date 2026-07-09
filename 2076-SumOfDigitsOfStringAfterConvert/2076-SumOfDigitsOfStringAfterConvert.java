// Last updated: 09/07/2026, 15:06:07
class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(char ch : s.toCharArray()){
            int value = ch-'a'+1;
            while(value>0){
                sum=sum+value%10;
                value=value/10;
            }
        }
        for(int i=1;i<k;i++){
            int temp=0;
            while(sum>0){
                temp=temp+sum%10;
                sum=sum/10;
            }
            sum=temp;
        }
        return sum;
    }
}