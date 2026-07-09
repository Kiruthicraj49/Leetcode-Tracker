// Last updated: 09/07/2026, 15:05:33
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int x:hours){
            if(x>=target){
                count++;
            }
        }
        return count;
    }
}