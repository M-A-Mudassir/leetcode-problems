class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] res = new int[l];
        int k = 0;
        int i=0;
        while(k<l){
            if(k % 2 == 0){
                res[k++] = nums[i++];
            }else{
                res[k++] = nums[n++];
            }
        }
        return res;
    }
}