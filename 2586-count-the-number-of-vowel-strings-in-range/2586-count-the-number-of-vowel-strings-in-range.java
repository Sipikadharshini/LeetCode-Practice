class Solution {

    public boolean isVowel(char c){
        if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') return true;

        return false;

    }
    public int vowelStrings(String[] words, int left, int right) {
            int count=0;
        for(int i=left;i<=right;i++){
            String temp=words[i];
            int n=temp.length()-1;
            if(isVowel(temp.charAt(0)) && isVowel(temp.charAt(n)) ) {
                count++;
            }

        }
        return count;
    }
}