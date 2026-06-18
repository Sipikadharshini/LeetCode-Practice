class Solution {
    public int numberOfBeams(String[] bank) {
   int prev = 0;
        int beams = 0;

        for (String row : bank) {
            int curr = 0;

            for (char c : row.toCharArray()) {
                if (c == '1')
                    curr++;
            }

            if (curr > 0) {
                beams += prev * curr;
                prev = curr;
            }
        }

        return beams;
    }
}