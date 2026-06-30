class Solution {
    public int helper(int[] nums,int idx,int[] dp){
        if(idx >= nums.length){
            return 0;
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int notTake = 0+helper(nums,idx+1,dp);
        int take = nums[idx]+helper(nums,idx+2,dp);
        return dp[idx] = Math.max(notTake,take);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
}