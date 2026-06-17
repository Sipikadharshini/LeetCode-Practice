class Solution {
    public int beautifulSubstrings(String s, int k) {
           int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int vowels = 0;

            for (int j = i; j < n; j++) {

                char c = s.charAt(j);

                if (isVowel(c))
                    vowels++;

                int len = j - i + 1;
                int consonants = len - vowels;

                if (vowels == consonants &&
                    (vowels * consonants) % k == 0) {
                    ans++;
                }
            }
        }

        return ans;
    }

    boolean isVowel(char c) {
       return "aeiou".indexOf(c)!=-1;
    }
    
}