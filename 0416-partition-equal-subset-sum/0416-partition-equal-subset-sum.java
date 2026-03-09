class Solution {
    public static boolean isSumExist(int[] nums,int idx,int tar,int[][] dp){
        if(idx == 0)return nums[0] == tar;
        if(dp[idx][tar] != -1){
            return dp[idx][tar] == 1;
        }
        boolean notPick = isSumExist(nums,idx-1,tar,dp);
        boolean pick = false;
        if(nums[idx] <= tar){
            pick = isSumExist(nums,idx-1,tar-nums[idx],dp);
        }
        dp[idx][tar] = (pick || notPick)?1:0;
        return (pick || notPick);
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        int[][] dp = new int[n][sum/2 +1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return isSumExist(nums,n-1,sum/2,dp);
    }
}