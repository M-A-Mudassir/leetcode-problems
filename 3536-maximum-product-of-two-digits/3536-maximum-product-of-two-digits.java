class Solution {
    public int maxProduct(int n) {
        String str = Integer.toString(n);
        int max1 = -1;
        int max2 = -1;
        int m=str.length();
        for(int i=0;i<m;i++){
            int curr = str.charAt(i)-'0';
            if(curr > max1){
                max2 = max1;
                max1 = curr;
            }else if(curr <= max1 && max2 < curr){
                max2 = curr;
            }
        }
        return max1*max2;
    }
}