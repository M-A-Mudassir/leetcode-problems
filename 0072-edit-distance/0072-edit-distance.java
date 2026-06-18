class Solution {
    public int genAll(int i,int j,String s1,String s2,int[][] dp){
        if(i < 0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = genAll(i-1,j-1,s1,s2,dp);
        }
        int t1 = 1+ genAll(i,j-1,s1,s2,dp);
        int t2 = 1+ genAll(i-1,j,s1,s2,dp);
        int t3 = 1+ genAll(i-1,j-1,s1,s2,dp);
        return dp[i][j] = Math.min(t1,Math.min(t2,t3));
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0] = i;
        }
        for(int i=0;i<=m;i++){
            dp[0][i] = i;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        return dp[n][m];
    }
}