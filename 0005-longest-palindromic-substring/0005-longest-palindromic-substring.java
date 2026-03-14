class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        int res = -1;
        String ans = "";
        for(int i=0;i<n;i++){
            int i1 = i;
            int i2 = i;
            while(i1>=0 && i2 < n && s.charAt(i1) == s.charAt(i2)){
                int l = i2-i1+1;
                if(res < l){
                    res = l;
                    ans = s.substring(i1,i2+1);
                }
                i1--;
                i2++;
            }
            i1 = i;
            i2 = i+1;
            while(i1 >=0 && i2 < n && s.charAt(i1) == s.charAt(i2)){
                int l = i2-i1+1;
                if(res < l){
                    res = l;
                    ans = s.substring(i1,i2+1);
                }
                i1--;
                i2++;
            }
        }
        return ans;
    }
}