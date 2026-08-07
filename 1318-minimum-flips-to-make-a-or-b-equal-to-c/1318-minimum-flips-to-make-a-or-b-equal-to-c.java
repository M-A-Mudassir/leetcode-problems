class Solution {
    public int minFlips(int a, int b, int c) {
        int sum = 0;
        for(int i=0;i<32;i++){
            int x = (a>>i) & 1;
            int y = (b >>i) & 1;
            int z = (c >>i) & 1;
            // System.out.println(x+" "+y+" "+z);
            if((x | y) != z){
                int x1 = (x+1)%2;
                int y1 = (y+1)%2;
                if((x1 | y)==z || (x | y1) == z){
                    sum++;
                }else{
                    sum += 2;
                }
            }
            // System.out.println(sum);
        }
        return sum;
    }
}