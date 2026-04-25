class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int sum = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 1){
                sum++;
                res = Math.max(sum,res);
            }else{
                sum =0;
            }
        }
        return res;
    }
}