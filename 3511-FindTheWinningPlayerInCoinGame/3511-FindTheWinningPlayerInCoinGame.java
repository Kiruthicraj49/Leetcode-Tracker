// Last updated: 09/07/2026, 15:05:24
class Solution {
    public String winningPlayer(int x, int y) {
      int turn=0;
      while(x>=0 && y>=0){
        x=x-1;
        y=y-4;
        turn++;
      }  
      if (turn%2==0){
        return "Alice";
      }
      else{
        return "Bob";
      }
    }
}