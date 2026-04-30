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
        int past = 1;
        int sum = 0;
        int curr = 0;
        sum += Math.max(past,larr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                curr = past+1;
            }else{
                curr = 1;
            }
            past = curr;
            sum += Math.max(curr,larr[i]);
        }
        return sum;
    }
}