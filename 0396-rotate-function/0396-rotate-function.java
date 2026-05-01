class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0,curr = 0,n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i];
            curr += i*nums[i];
        }
        int res = curr;
        for(int i=1;i<n;i++){
            curr += sum - n*nums[n-i];
            res = Math.max(curr,res);
        }
        return res;
    }
}