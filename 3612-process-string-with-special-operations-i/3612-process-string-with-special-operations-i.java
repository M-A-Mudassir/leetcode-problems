class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(sb.length() >= 1){
                    sb.delete(sb.length()-1,sb.length());
                }
            }else if(ch == '#'){
                sb.append(sb);
            }else if(ch == '%'){
                sb.reverse();
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}