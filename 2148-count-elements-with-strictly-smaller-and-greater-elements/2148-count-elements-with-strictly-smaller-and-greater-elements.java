class Solution {
public int countElements(int[] nums) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

       for (int num : nums) {
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        int count = 0;

        for (int num : nums) {
            if (num > mn && num < mx) {
                count++;
            }
        }

        return count;
    }
};