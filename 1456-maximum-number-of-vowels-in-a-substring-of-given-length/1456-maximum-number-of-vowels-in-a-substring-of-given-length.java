class Solution {
    public int maxVowels(String s, int k) {
        int res = 0,n=s.length();
        int sum = 0;
        String st = "aeiou";
        for(int i=0;i<k;i++){
            if(st.indexOf(s.charAt(i)) != -1){
                sum++;
            }
        }
        res = Math.max(res,sum);
        for(int i=k;i<n;i++){
            if(st.indexOf(s.charAt(i-k)) != -1){
                sum--;
            }
            if(st.indexOf(s.charAt(i)) != -1){
                sum++;
            }
            res = Math.max(res,sum);
        }
        return res;
    }
}