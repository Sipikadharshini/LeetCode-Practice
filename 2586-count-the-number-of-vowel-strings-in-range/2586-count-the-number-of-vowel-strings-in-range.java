class Solution {

    public boolean isVowel(char c){
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') return true;

        return false;

    }
    public int vowelStrings(String[] words, int left, int right) {
            int ind=0;
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            int n=temp.length()-1;
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(n)) ) {
                if(i>=left && i<=right){
                           ind++;
                }
            }

        }
        return ind;
    }
}