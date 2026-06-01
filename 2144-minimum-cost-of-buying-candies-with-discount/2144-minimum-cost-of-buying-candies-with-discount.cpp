class Solution {
public:
    int minimumCost(vector<int>& cost) {
        // Sort in descending order
        sort(cost.begin(), cost.end(), greater<int>());
        
        int total = 0;
        for (int i = 0; i < cost.size(); i++) {
            // Pay for the first two candies in each group of three
            if (i % 3 != 2) {
                total += cost[i];
            }
        }
        return total;
    }
};
