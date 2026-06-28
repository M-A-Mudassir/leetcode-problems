import java.util.Stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0;i<n;i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }else{
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])){
                    st.pop();
                }else if(st.isEmpty() || st.peek() < 0){
                    st.push(asteroids[i]);
                }
            }
        }
        int m = st.size();
        int[] res = new int[m];
        for(int i=m-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
}