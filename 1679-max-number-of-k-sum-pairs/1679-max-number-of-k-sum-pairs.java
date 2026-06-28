class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l=0, r=n-1;
        int res = 0;
        while(l < r){
            int sum = nums[l]+nums[r];
            if(sum == k){
                res++;
                l++;
                r--;
            }else if(sum > k){
                r--;
            }else{
                l++;
            }
        }
        return res;
    }
}