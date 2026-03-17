class Solution {
    public int binarySearch(int[]nums,int tar,int st,int end,boolean lo){
        int res = -1;
        while(st <= end){
            int mid = (st+end)/2;
            if(nums[mid] == tar){
                res = mid;
                if(lo){
                    end = mid - 1;
                }else{
                    st = mid + 1;
                }
            }else if(nums[mid] > tar){
                end = mid -1;
            }else{
                st = mid + 1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int i = binarySearch(nums,target,0,n-1,true);
        int j = binarySearch(nums,target,0,n-1,false);
        return new int[]{i,j};
    }
}