class Solution {
    public String frequencySort(String s) {
        int[][] arr = new int[128][2];
        for(int i=0;i<128;i++){
            arr[i][1] = i;
        }
        for(char ch:s.toCharArray()){
            arr[ch][0]++;
        }
        Arrays.sort(arr,(a,b)->(b[0]-a[0]));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<128;i++){
            if(arr[i][0] > 0){
                for(int j=0;j<arr[i][0];j++){
                    sb.append((char)arr[i][1]);
                }
            }
        }
        return sb.toString();
    }
    
}