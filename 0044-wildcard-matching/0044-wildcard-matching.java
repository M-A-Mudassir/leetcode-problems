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
        boolean[][] dp = new boolean[n+1][m+1];
        dp[0][0] = true;
        for(int i=1;i<=n;i++){
            dp[i][0] = false;
        }
        for(int i=1;i<=m;i++){
            boolean flag = true;
            for(int j=1;j<=i;j++){
                if(p.charAt(j-1) != '*'){
                    flag = false;
                    break;
                }
            }
            dp[0][i] = flag;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?'){
                    dp[i][j] = dp[i-1][j-1];
                }else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
}
