class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String st :words){
            int sum =0 , n=st.length();
            for(int i=0;i<n;i++){
                sum += weights[st.charAt(i)-'a'];
            }
            char ch = (char)('a'+(25-(sum % 26)));
            sb.append(ch);
        }
        return sb.toString();
    }
}