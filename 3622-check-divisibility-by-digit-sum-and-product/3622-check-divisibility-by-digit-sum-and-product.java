class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        String str = Integer.toString(n);
        for(char ch:str.toCharArray()){
            sum += ch-'0';
            prod *= (ch-'0');
        }   
        return n % (sum+prod) == 0;

    }
}