class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int sum = 0,n = A.length;
        int[] res = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
            if(hm.get(A[i]) == 2){
                sum++;
            }
            hm.put(B[i],hm.getOrDefault(B[i],0)+1);
            if(hm.get(B[i]) == 2){
                sum++;
            }
            res[i] = sum;
        }
        return res;
    }
}