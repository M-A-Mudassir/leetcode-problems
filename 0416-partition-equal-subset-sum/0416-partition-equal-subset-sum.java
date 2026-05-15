class Solution {
    public static boolean isPoss(int[] nums,int idx,int tar,int[][] dp){
        if(idx == 0){
            return nums[0] == tar;
        }
        if(dp[idx][tar] != -1){
            return dp[idx][tar] == 1;
        }
        boolean nP = isPoss(nums,idx-1,tar,dp);
        boolean p = false;
        if(nums[idx] <= tar)
            p =  isPoss(nums,idx-1,tar-nums[idx],dp);
        dp[idx][tar] = (p || nP)?1:0;
        return (p||nP);
    }
    public boolean canPartition(int[] nums) {
        int sum =0,n=nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0)
            return false;
        int[][] dp = new int[n][sum/2+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return isPoss(nums,n-1,sum/2,dp);
    }
}