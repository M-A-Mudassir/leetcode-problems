class Solution {
    public boolean isSorted(int[] nums,int i){
        int n = nums.length;
        int k = (i-1+n)%n;
        for(int j=i;j != k ;j = (j+ 1) % n){
            if(nums[j] > nums[(j+1) % n]){
                return false;
            }
        }
        return true;
    }
    public boolean check(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(isSorted(nums,i)){
                return true;
            }
        }        
        return false;
    }
}