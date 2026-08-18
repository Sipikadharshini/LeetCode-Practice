class Solution {
    public int largestInteger(int[] nums, int k) {
       int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                seen.add(nums[j]);
            }
 
            for (int num : seen) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        int ans = -1;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}