class Solution {
    public int minDistance(String word1, String word2) {
        String s = word1;
        String s2 = word2;
        int n = s.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][0] = 0;
        }
        for(int i=0;i<m;i++){
            dp[0][i] = 0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return n-dp[n][m]+m-dp[n][m];
    }
}