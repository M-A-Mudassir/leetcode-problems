class Solution {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(res < nums[i]){
                res = nums[i];
            }
        }
        int prod = 1;
        for(int i=0;i<n;i++){
            prod *= nums[i];
            res = Math.max(res,prod);
            if(prod == 0){
                prod = 1;
            }
        }
        prod = 1;
        for(int i=n-1;i>=0;i--){
            prod *= nums[i];
            res = Math.max(res,prod);
            if(prod == 0){
                prod = 1;
            }
        }
        return res;
    }
}