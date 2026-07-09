// Last updated: 09/07/2026, 15:05:11
class Solution {
    static final long MOD = 1_000_000_007L;
    public int maxTotalValue(int[] value, int[] decay, int m) {
        int n = value.length;
        long lo = 1, hi = 0;
        for (int v : value) hi = Math.max(hi, v);
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long cnt = 0;
            for (int i = 0; i < n; i++) {
                if (value[i] >= mid) {
                    cnt += (value[i] - mid) / decay[i] + 1;
                    if (cnt > m) break;
                }
            }
            if (cnt >= m)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        long threshold = hi;
        long totalCount = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (value[i] < threshold) continue;
            long k = (value[i] - threshold) / decay[i] + 1;
            totalCount += k;
            long first = value[i];
            long last = value[i] - (k - 1) * (long) decay[i];
            long sum = k * (first + last) / 2;
            ans = (ans + sum) % MOD;
        }
        if (totalCount > m) {
            ans = (ans - ((totalCount - m) % MOD) * (threshold % MOD)) % MOD;
        }
        ans %= MOD;
        if (ans < 0) ans += MOD;
        return (int) ans;
    }
}