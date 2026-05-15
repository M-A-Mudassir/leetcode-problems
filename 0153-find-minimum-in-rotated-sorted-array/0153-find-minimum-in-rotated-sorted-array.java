class Solution {
    public int findMin(int[] nums) {
        int lo = 0;
        int hi = nums.length-1;
        int res = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[lo] <= nums[mid]){
                res = Math.min(res,nums[lo]);
                lo = mid +1 ;
            }else if( nums[mid] <= nums[hi]){
                res = Math.min(res,nums[mid]);
                hi = mid -1;
            }
        }
        return res;
    }
}