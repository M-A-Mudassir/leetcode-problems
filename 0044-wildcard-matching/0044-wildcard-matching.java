class Solution {
    public boolean genAll(int i,int j,String s,String p,int[][] dp){
        if(i == s.length() && j == p.length()){
            return true;
        }
        if(i < s.length() && j == p.length())return false;
        if(i == s.length() && j < p.length()){
            for(int k = j;k<p.length();k++){
                if(p.charAt(k) != '*'){
                    return false;
                }
            }
            return true;
        }
        if(dp[i][j] != -1){
            return dp[i][j] == 1;
        }
        if(s.charAt(i) == p.charAt(j) || p.charAt(j) == '?'){
            dp[i][j] = (genAll(i+1,j+1,s,p,dp)?1:0);
            if(dp[i][j] == 1){
                return true;
            }
        }else if(p.charAt(j) == '*'){
            dp[i][j] = (genAll(i+1,j,s,p,dp) || genAll(i,j+1,s,p,dp))?1:0;
            if(dp[i][j] == 1){
                return true;
            }
        }
        dp[i][j] = 0;
        return  false;
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return genAll(0,0,s,p,dp);
    }
}
