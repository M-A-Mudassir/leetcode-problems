class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0){
            return "0";
        }
        StringBuilder res = new StringBuilder();
        if(numerator <0 ^ denominator < 0){
            res.append("-");
        }
        long num = Math.abs(Long.valueOf(numerator));
        long den = Math.abs(Long.valueOf(denominator));
        res.append(num/den);
        long rem = num % den;
        if(rem == 0)return res.toString();
        res.append(".");
        HashMap<Long,Integer> hm = new HashMap<>();
        while(rem != 0){
            if(hm.containsKey(rem)){
                res.insert(hm.get(rem),"(");
                res.append(")");
                break;
            }
            hm.put(rem,res.length());
            rem = rem * 10;
            res.append(rem/den);
            rem = rem % den;
        }
        return res.toString();
    }
}