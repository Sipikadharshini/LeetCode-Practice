class Solution {
    public int countHomogenous(String s) {
          int MOD = 1_000_000_007;
        long ans = 0;
        long count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                count = 1;
            } else {
                count++;
            }

            ans = (ans + count) % MOD;
        }

        return (int) ans;
    }
}