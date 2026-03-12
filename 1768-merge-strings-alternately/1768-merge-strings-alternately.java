class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0,j=0;
        int n1 = word1.length();
        int n2 = word2.length();
        boolean k = true;
        while(i<n1 && j<n2){
            if(k){
                sb.append(word1.charAt(i));
                i++;
                k = false;
            }else{
                sb.append(word2.charAt(j));
                j++;
                k = true;
            }
        }
        while(i<n1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<n2){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}