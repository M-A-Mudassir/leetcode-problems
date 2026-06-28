class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0 ,l=0,zero = 0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                zero++;
            }
            if(zero > k){
                if(nums[l] == 0){
                    zero--;
                }
                l++;
            }
            if(zero <= k){
                res = Math.max(res,i-l+1);
            }
        }
        return res;
    }
}