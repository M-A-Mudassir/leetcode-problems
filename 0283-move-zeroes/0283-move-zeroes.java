class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] != 0 && nums[j] == 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            if(nums[j] != 0){
                j++;
            }
        }        
    }
}