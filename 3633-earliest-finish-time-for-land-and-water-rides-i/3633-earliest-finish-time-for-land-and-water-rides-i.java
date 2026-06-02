class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
          
                int finishLand = landStartTime[i] + landDuration[i];
                int startWater = Math.max(finishLand, waterStartTime[j]);
                int finishLW = startWater + waterDuration[j];
                int finishWater = waterStartTime[j] + waterDuration[j];
                int startLand = Math.max(finishWater, landStartTime[i]);
                int finishWL = startLand + landDuration[i];

                ans = Math.min(ans, Math.min(finishLW, finishWL));
            }
        }
        return ans;
    }
}