class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int n = nums.length;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        double res = sum/k;
        for(int i=k;i<n;i++){
            sum -= nums[i-k];
            sum += nums[i];
            res = Math.max(res,sum/k);
        }
        return res;
    }
}