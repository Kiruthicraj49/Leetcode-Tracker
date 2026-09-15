# Last updated: 15/09/2026, 09:14:53
1from collections import Counter
2class Solution:
3    def findWinners(self, matches: list[list[int]]) -> list[list[int]]:
4        losses = Counter()
5        players = set()
6        for winner, loser in matches:
7            players.add(winner)
8            players.add(loser)
9            losses[loser] += 1
10        zero_losses = []
11        one_loss = []
12        for player in players:
13            if losses[player] == 0:
14                zero_losses.append(player)
15            elif losses[player] == 1:
16                one_loss.append(player)
17        return [sorted(zero_losses), sorted(one_loss)]