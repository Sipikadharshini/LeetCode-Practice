class Solution {
    public String processStr(String s) {
        
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*'){
                 if (sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1);
    }
               /* if(s.indexOf('*')==0){
                     sb.append("");
                }
                else{
                int n=sb.length()-1;
                if(n!=-1){
                sb.deleteCharAt(n);
                }
                }*/
            }
             else if(s.charAt(i)=='#'){
                 sb.append(sb.toString());
            }
            else{
                sb.reverse();
            }
        }
        return sb.toString();
    }
}