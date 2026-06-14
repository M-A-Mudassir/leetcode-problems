class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n == 1)return 1;
        int l=0;
        long sum = 0;
        int res = 0;
        for(int r=0;r<n;r++){
            long t = nums[r];
            sum += nums[r];
            while(sum+k <  t*(r-l+1)){
                sum -= nums[l];
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}