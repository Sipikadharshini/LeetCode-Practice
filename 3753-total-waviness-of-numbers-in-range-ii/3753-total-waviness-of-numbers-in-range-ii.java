class Solution {

    String num;
    long[][][][][][] waysMemo;
    long[][][][][][] sumMemo;
    boolean[][][][][][] seen;

    public long totalWaviness(long num1, long num2) {
        return solve(num2) - solve(num1 - 1);
    }

    private long solve(long x) {
        if (x < 0) return 0;

        num = Long.toString(x);
        int n = num.length();

        waysMemo = new long[n + 1][2][3][11][11][2];
        sumMemo = new long[n + 1][2][3][11][11][2];
        seen = new boolean[n + 1][2][3][11][11][2];

        return dfs(0, 1, 0, 10, 10, 0)[1];
    }

    private long[] dfs(int pos, int tight, int len,
                       int prev2, int prev1, int started) {

        if (pos == num.length()) {
            return new long[]{1, 0};
        }

        if (seen[pos][tight][len][prev2][prev1][started]) {
            return new long[]{
                waysMemo[pos][tight][len][prev2][prev1][started],
                sumMemo[pos][tight][len][prev2][prev1][started]
            };
        }

        long ways = 0;
        long sum = 0;

        int limit = (tight == 1) ? num.charAt(pos) - '0' : 9;

        for (int d = 0; d <= limit; d++) {

            int ntight = (tight == 1 && d == limit) ? 1 : 0;

            if (started == 0 && d == 0) {
                long[] nxt = dfs(pos + 1, ntight, 0, 10, 10, 0);
                ways += nxt[0];
                sum += nxt[1];
            } else if (started == 0) {
                long[] nxt = dfs(pos + 1, ntight, 1, 10, d, 1);
                ways += nxt[0];
                sum += nxt[1];
            } else if (len == 1) {
                long[] nxt = dfs(pos + 1, ntight, 2, prev1, d, 1);
                ways += nxt[0];
                sum += nxt[1];
            } else {

                int add = 0;

                if ((prev1 > prev2 && prev1 > d) ||
                    (prev1 < prev2 && prev1 < d)) {
                    add = 1;
                }

                long[] nxt = dfs(pos + 1, ntight, 2, prev1, d, 1);

                ways += nxt[0];
                sum += nxt[1] + add * nxt[0];
            }
        }

        seen[pos][tight][len][prev2][prev1][started] = true;
        waysMemo[pos][tight][len][prev2][prev1][started] = ways;
        sumMemo[pos][tight][len][prev2][prev1][started] = sum;

        return new long[]{ways, sum};
    }
}