class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for(int i=1;i<m;i++){
            dp[0][i] = grid[0][i]+dp[0][i-1];
        }
        for(int i=1;i<n;i++){
            dp[i][0] = grid[i][0]+dp[i-1][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1]+grid[i][j] -dp[i-1][j-1];
            }
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dp[i][j] <= k){
                    sum++;
                }
            }
        }
        return sum;
    }
}