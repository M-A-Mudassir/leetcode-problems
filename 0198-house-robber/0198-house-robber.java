class Solution {
    public static int helper(int[] nums,int[] dp,int idx){
        if(idx >= nums.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int pick = nums[idx] + helper(nums,dp,idx+2);
        int nPick = 0 + helper(nums,dp,idx+1);
        return dp[idx] = Math.max(pick,nPick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,dp,0);
    }
}