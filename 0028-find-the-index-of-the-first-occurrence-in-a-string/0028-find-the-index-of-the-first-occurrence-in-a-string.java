class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if(m > n){
            return -1;
        }
        if(m == n){
            return (haystack.equals(needle))?0:-1;
        }
        for(int i=0;i<n;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(i+m <= n){
                    String s = haystack.substring(i,i+m);
                    if(s.equals(needle)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}