class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] larr = new int[n];
        int[] rarr = new int[n];
        larr[0] = 1;
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                larr[i] = larr[i-1]+1;
            }else{
                larr[i] = 1;
            }
        }
        rarr[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                rarr[i] = rarr[i+1]+1;
            }else{
                rarr[i] = 1;
            }
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum += Math.max(larr[i],rarr[i]);
        }
        return sum;
    }
}