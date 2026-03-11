class Solution {
    public int finAll(int idx,int sum,int[] nums,int tar){
        if(idx == nums.length){
            if(sum == tar){
                return 1;
            }
            return 0;
        }
        return (finAll(idx+1,sum-nums[idx],nums,tar) + finAll(idx+1,sum+nums[idx],nums,tar));
    }
    public int findTargetSumWays(int[] nums, int target) {
        return finAll(0,0,nums,target);
    }
}