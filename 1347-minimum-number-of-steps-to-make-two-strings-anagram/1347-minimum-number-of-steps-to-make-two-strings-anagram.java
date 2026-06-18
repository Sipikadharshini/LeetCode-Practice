class Solution {
    public int minSteps(String s, String t) {
        
        int[] freqs=new int[26];
        for(char c:s.toCharArray()){
            freqs[c-'a']++;
        }
        int[] freqt=new int[26];
        for(char c:t.toCharArray()){
            freqt[c-'a']++;
        }
        int ans=0;
        for (int i = 0; i < 26; i++) {
            if (freqs[i] < freqt[i])
                ans += freqt[i] - freqs[i];
        }
        return ans;      
    }
}