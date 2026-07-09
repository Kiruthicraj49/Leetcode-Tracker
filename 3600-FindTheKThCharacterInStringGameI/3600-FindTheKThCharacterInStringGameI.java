// Last updated: 09/07/2026, 15:05:21
class Solution {
    public char kthCharacter(int k) {
        return find(k);
    }

    private char find(int k) {
        if (k == 1) {
            return 'a';
        }
        int len = 1;
        while (len < k) {
            len = len * 2;
        }
        int half = len / 2;
        if (k <= half) {
            return find(k);
        }
        return (char) (find(k - half) + 1);
    }
}