class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0 , n=nums.length;
        int l = 0;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum += nums[i];
            while(sum >= target && i >= l){
                sum -= nums[l];
                res = Math.min(res,i-l+1);
                l++;
            }
        }
        return (res == Integer.MAX_VALUE)?0:res;
    }
}