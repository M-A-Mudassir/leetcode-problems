class Solution {
    public int longestSubarray(int[] nums) {
        int res=0 , l=0 , n=nums.length , z=0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                z++;
            }
            if(z > 1){
                if(nums[l] == 0){
                    z--;
                }
                l++;
            }
            if(z <= 1){
                res = Math.max(i-l,res);
            }
        }
        return res;
    }
}