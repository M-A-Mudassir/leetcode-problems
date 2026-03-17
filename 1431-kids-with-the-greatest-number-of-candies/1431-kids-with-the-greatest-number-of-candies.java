class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        int n = candies.length;
        for(int i=0;i<n;i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        List<Boolean> li = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies >= max){
                li.add(true);
            }else{
                li.add(false);
            }
        }
        return li;

    }
}