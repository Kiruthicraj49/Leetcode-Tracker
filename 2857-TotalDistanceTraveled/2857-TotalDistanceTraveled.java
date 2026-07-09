// Last updated: 09/07/2026, 15:05:35
class Solution {
    public int distanceTraveled(int MT, int AT) {
        int total=0;
        while(MT>=5){
            total=total+50;
            MT=MT-5;
            if(AT>=1){
                MT++;
                AT--;
            }
        }
        return total+(MT*10);
    }
}