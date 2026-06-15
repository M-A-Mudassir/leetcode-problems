class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int prod = 1;
        int n = nums.length;
        for(int j = n-1;j>=(n-3);j--){
            prod *= nums[j];
        }
        int prod2 = nums[0]*nums[1]*nums[n-1];
        return Math.max(prod,prod2);
    }
}