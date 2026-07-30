# Last updated: 30/07/2026, 21:35:22
1class Solution:
2    def minimumPushes(self, word: str) -> int:
3        n=len(word);
4        pushes=0;
5        for i in range(n):
6            pushes = pushes+ (i//8)+1;
7        return pushes