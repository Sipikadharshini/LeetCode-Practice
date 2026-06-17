class Solution {
    public String sortVowels(String s) {
   List<Character> vowels = new ArrayList<>();

        
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }

       
        Collections.sort(vowels);

        StringBuilder ans = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                ans.append(vowels.get(idx++));
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }

    private boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}