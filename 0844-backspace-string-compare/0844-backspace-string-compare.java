class Solution {
    public boolean backspaceCompare(String s, String t) {
       
        StringBuilder ss=new StringBuilder();
        for(char ch:s.toCharArray()){
         
            if(Character.isLetter(ch)){
                ss.append(ch);
            }
            else{
                if(ss.length()>0){
                    ss.deleteCharAt(ss.length()-1);
                }
            }
        }
         StringBuilder tt=new StringBuilder();
        for(char ch:t.toCharArray()){
         
            if(Character.isLetter(ch)){
                tt.append(ch);
            }
            else{
                if(tt.length()>0){
                    tt.deleteCharAt(tt.length()-1);
                }
            }
        }
        return ss.toString().equals(tt.toString());
    }
}