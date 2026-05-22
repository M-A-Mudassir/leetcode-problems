class Solution {
    public int bs(int lo,int hi,int[] nums, int tar){
        if(lo <= hi){
            int mid = (lo+hi)/2;
            if(nums[mid] == tar){
                return mid;
            }else{
                int k = bs(lo,mid-1,nums,tar);
                if(k != -1){
                    return k;
                }
                return bs(mid+1,hi,nums,tar);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n-1;
        return bs(lo,hi,nums,target);
    }
}