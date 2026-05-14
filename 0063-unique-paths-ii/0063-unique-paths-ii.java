class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        boolean rockFound = false;
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<m;i++){
            if(obstacleGrid[0][i]==0 && !rockFound){
                dp[0][i] = 1;
            }else{
                dp[0][i] = 0;
                if(obstacleGrid[0][i] == 1){
                    rockFound = true;
                }
            }
        }
        rockFound = false;
        for(int i=0;i<n;i++){
            if(obstacleGrid[i][0]==0 && !rockFound){
                dp[i][0] = 1;
            }else{
                dp[i][0] = 0;
                if(obstacleGrid[i][0] == 1){
                    rockFound = true;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return dp[n-1][m-1];        
    }
}