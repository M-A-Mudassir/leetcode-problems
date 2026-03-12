class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<=amount;i++){
            for(int j:coins){
                if(i-j >= 0 && dp[i-j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(1+dp[i-j],dp[i]);
                }
            }
        }
        return (dp[amount] == Integer.MAX_VALUE)?-1:dp[amount];

    }
}