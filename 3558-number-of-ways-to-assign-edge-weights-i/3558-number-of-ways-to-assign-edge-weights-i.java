class Solution {
    static final int MOD = 1000000007;
     public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());
        
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        boolean[] visited = new boolean[n+1];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1, 0});
        visited[1] = true;
        int maxDepth = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0], depth = cur[1];
            maxDepth = Math.max(maxDepth, depth);
            for (int nei : adj.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    q.add(new int[]{nei, depth+1});
                }
            }
        }
        return modPow(2, maxDepth-1, MOD);
    }

    private int modPow(long base, long exp, int mod) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return (int) res;
        
    }
}