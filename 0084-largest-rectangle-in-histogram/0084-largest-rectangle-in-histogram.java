class Solution {
    public int[] prevMin(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int[] nextMin(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i] = n;
            }else{
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int[] rMin = nextMin(heights);
        int[] lMin = prevMin(heights);
        int n = heights.length;
        int res = 0;
        for(int i=0;i<n;i++){
            res = Math.max(res,(rMin[i]-lMin[i]-1)*heights[i]);
        }
        return res;
    }
}