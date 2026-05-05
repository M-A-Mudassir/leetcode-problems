class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int[] res = new int[n1];
        int n = nums2.length;
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>(); 
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums2[st.peek()] < nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                hm.put(nums2[i],-1);
            }else{
                hm.put(nums2[i],nums2[st.peek()]);
            }
            st.push(i);
        }
        for(int i=0;i<n1;i++){
            res[i] = hm.get(nums1[i]);
        }
        return res;
    }
}