class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = n-1;
        Arrays.sort(nums);
        int[] res = new int[n];
        while(i < n){
            res[i] = nums[j];
            i = i+2;
            j--;
        }
        i = 0;
        while(i < n){
            res[i] = nums[j];
            i = i+2;
            j--;
        }
        for(int k = 0;k<n;k++){
            nums[k] = res[k];
        }
    }
}