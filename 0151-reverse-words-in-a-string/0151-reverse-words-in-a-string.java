class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        int n = str.length;
        int i=0,j=n-1;
        while(i<=j){
            String k = str[i];
            str[i] = str[j];
            str[j] = k;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        int k = str.length;
        for(int ii=0;ii<k-1;ii++){
            if(str[ii].trim() != ""){
                sb.append(str[ii]+" ");
            }
        }
        sb.append(str[k-1]);
        return sb.toString();
    }
}