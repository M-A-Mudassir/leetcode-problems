class Solution {
    public int genAll(int[] cost,int idx,int[] dp){
        if(idx >= cost.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        return dp[idx] = cost[idx] + Math.min(genAll(cost,idx+1,dp),genAll(cost,idx+2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int t = genAll(cost,0,dp);
        Arrays.fill(dp,-1);
        return Math.min(t,genAll(cost,1,dp));
    }
}