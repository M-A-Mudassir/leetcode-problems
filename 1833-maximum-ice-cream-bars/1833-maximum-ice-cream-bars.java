class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int maxCoins = Integer.MIN_VALUE;
        int n = costs.length;
        for(int i=0;i<n;i++){
            if(maxCoins < costs[i]){
                maxCoins = costs[i];
            }
        }        
        int[] count = new int[maxCoins+1];
        for(int i=0;i<n;i++){
            count[costs[i]]++;
        }
        int sum = 0;
        for(int i=1;i<=maxCoins;i++){
            if(count[i] > 0){
                int min = Math.min(count[i],coins/i);
                sum += min;
                coins -= min*i;
            }
        }
        return sum;
    }
}