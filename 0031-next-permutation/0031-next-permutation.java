class Solution {
    public void rev(int i,int j,int[] nums){
        while(i <= j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            i++;
            j--;
        }        
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return;
        }
        int pivot = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                pivot = i;
                break;
            }
        }
        if(pivot == -1){
            rev(0,n-1,nums);
        }else{
            for(int j=n-1;j>pivot;j--){
                if(nums[j] > nums[pivot]){
                    int temp = nums[pivot];
                    nums[pivot] = nums[j];
                    nums[j] = temp; 
                    break;
                }
            }
            rev(pivot+1,n-1,nums);
        }
    }
}