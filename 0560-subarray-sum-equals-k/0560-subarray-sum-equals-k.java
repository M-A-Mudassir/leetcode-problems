class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        int cnt  = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(pre[i] == k){
                cnt++;
            }
            if(hm.containsKey(pre[i]-k)){
                cnt += hm.get(pre[i]-k);
            }
            hm.put(pre[i],hm.getOrDefault(pre[i],0)+1);
        }
        return cnt;
    }
}