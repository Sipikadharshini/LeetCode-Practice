class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m=magazine.length();
        int r=magazine.length();
      int[] count=new int[26];
        HashMap<Character,Integer> map=new HashMap<>();
      for(char c:magazine.toCharArray()){
        count[c-'a']++;
      } 
      for(char c:ransomNote.toCharArray()){
        if(count[c-'a']==0) return false;
       count[c-'a']--;
      }


         return true;
    }
}