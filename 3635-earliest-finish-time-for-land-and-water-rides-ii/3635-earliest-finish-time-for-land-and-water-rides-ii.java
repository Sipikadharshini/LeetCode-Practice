class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;

        long minLandEnd = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            minLandEnd = Math.min(minLandEnd,
                    (long) landStartTime[i] + landDuration[i]);
        }

        long minWaterEnd = Long.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            minWaterEnd = Math.min(minWaterEnd,
                    (long) waterStartTime[j] + waterDuration[j]);
        }

        long ans = Long.MAX_VALUE;
        for (int j = 0; j < m; j++) {
            ans = Math.min(ans,
                    Math.max((long) waterStartTime[j], minLandEnd)
                            + waterDuration[j]);
        }
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans,
                    Math.max((long) landStartTime[i], minWaterEnd)
                            + landDuration[i]);
        }

        return (int) ans;
    }
}