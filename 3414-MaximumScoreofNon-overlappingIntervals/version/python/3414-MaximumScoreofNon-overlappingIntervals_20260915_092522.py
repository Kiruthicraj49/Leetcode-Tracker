# Last updated: 15/09/2026, 09:25:22
1import bisect
2import functools
3
4
5class Solution:
6    def maximumWeight(self, intervals: list[list[int]]) -> list[int]:
7        arr = sorted((*interval, i) for i, interval in enumerate(intervals))
8        n = len(arr)
9        @functools.lru_cache(None)
10        def dp(i: int, count: int):
11            if i == n or count == 0:
12                return (0, ())
13            best_weight, best_indices = dp(i + 1, count)
14            l, r, w, original_idx = arr[i]
15            next_i = bisect.bisect_right(arr, (r, float("inf")))
16            next_w, next_indices = dp(next_i, count - 1)
17            take_w = w + next_w
18            take_indices = tuple(sorted((original_idx, *next_indices)))
19            if take_w > best_weight or (
20                take_w == best_weight and take_indices < best_indices
21            ):
22                return (take_w, take_indices)
23            return (best_weight, best_indices)
24        return list(dp(0, 4)[1])