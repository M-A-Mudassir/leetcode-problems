class Solution {
    public int maxArea(int[] height) {
        int l = 0,h = height.length - 1;
        int maxWat = 0;
        while(l<h){
            int w = h-l;
            int he = Math.min(height[h],height[l]);
            int ar = w * he;
            maxWat = Math.max(maxWat,ar);
            if(height[l] < height[h]){
                l++;
            }else{
                h--;
            }
        }
        return maxWat;
    }
}