class Solution {
    public int coinOptions(int[] coins,int amt,int[] dp){
        if(amt == 0){
            return 0;
        }
        if(amt < 0){
            return -1;
        }
        if(dp[amt] != -2){
            return dp[amt];
        }
        int min = Integer.MAX_VALUE;
        for(int i:coins){
            int curr = coinOptions(coins,amt-i,dp);
            if(curr >= 0 && curr < min){
                min = curr;
            }
            
        }
        dp[amt] = (min == Integer.MAX_VALUE)?-1:min+1;
        return dp[amt];
    }
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-2);
        return coinOptions(coins,amount,dp);
    }
}