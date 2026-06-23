class Solution {
    public int zigZagArrays(int n, int l, int r) {
        int mod =(int)1e9+7;
        int k = r-l+1;
        long[] dp = new long[k];
        Arrays.fill(dp,1);
        boolean flag = true;
        for(int i=2;i<=n;i++){
            long sum = 0;
            if(flag){
                for(int j=0;j<k;j++){
                    long val = dp[j];
                    dp[j] = sum;
                    sum = (sum + val) % mod;
                }
            }else{
                for(int j=k-1;j>=0;j--){
                    long val = dp[j];
                    dp[j] = sum;
                    sum = (sum + val) % mod;
                }
            }
            flag = !flag;
        }
        long res = 0;
        for(long i:dp){
            res = (res + i) % mod;
        }
        res = (res*2) % mod;
        return (int)res;

    }
}