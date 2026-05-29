class Solution {
    public int minElement(int[] nums) {
        int res = Integer.MAX_VALUE;
        for(int ele : nums){
            int sum = 0;
            while(ele > 0){
                int rem = ele % 10;
                sum += rem;
                ele /= 10;
            }
            if(res > sum){
                res = sum;
            }
        }
        return res;
    }
}