// Last updated: 09/07/2026, 15:08:51
class Solution {
    public int lengthOfLastWord(String s) {
        String[] last = s.trim().split("\\s+");
        return last[last.length - 1].length();
    }
}