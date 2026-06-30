class Solution {
    public int numberOfSubstrings(String s) {
        int[] lstSeen = new int[3];
        int sum = 0,n=s.length();
        Arrays.fill(lstSeen,-1);
        for(int i=0;i<n;i++){
            lstSeen[s.charAt(i)-'a'] = i;
            if(lstSeen[0] != -1 && lstSeen[1] != -1 && lstSeen[2] != -1){
                sum += 1+ Math.min(lstSeen[0],Math.min(lstSeen[1],lstSeen[2]));
            }
        }
        return sum;
    }
}