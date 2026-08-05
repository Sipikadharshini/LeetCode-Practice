class Solution {
    public int getWinner(int[] arr, int k) {
         if (k == 1) {
            return Math.max(arr[0], arr[1]);
        }
        int maxi=0;
        if(k>=arr.length){
            for(int num:arr){
                maxi=Math.max(maxi,num);
            }
            return maxi;
        }
int current_winner = arr[0];
        int consecutive_wins = 0;

        for (int i = 1; i < arr.length; i++) {
            if (current_winner > arr[i]) {
                consecutive_wins++;
            } else {
                current_winner = arr[i];
                consecutive_wins = 1;
            }

            if (consecutive_wins == k) {
                return current_winner;
            }
        }

        return current_winner;
        }
}