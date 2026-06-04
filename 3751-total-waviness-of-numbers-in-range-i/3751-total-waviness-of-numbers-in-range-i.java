class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;
        for(int j=num1;j<=num2;j++){
            if(j >= 100){
                String str = Integer.toString(j);
                int n = str.length();
                for(int i=1;i<n-1;i++){
                    if(str.charAt(i) > str.charAt(i-1) && str.charAt(i) > str.charAt(i+1) || str.charAt(i) < str.charAt(i-1) && str.charAt(i) < str.charAt(i+1) ){
                        sum++;
                    }
                }
            }
        }
        return sum;        
    }
}