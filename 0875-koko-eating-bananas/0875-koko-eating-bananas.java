class Solution {
    public boolean valid(int[] piles,int h,int k){
        int n = piles.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += Math.ceil((double)piles[i]/k);
            //System.out.println(piles[i]/k +" "+piles[i]+" "+k);
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = piles.length;
        for(int i=0;i<n;i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        int ans = -1;
        int lo =1, hi = max;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(valid(piles,h,mid)){
                ans = mid;
                hi = mid -1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
}