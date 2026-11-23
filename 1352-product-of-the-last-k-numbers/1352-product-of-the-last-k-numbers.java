class ProductOfNumbers {
    static ArrayList<Integer> li = new ArrayList<>();

    public ProductOfNumbers() {
        li.clear();
    }
    
    public void add(int num) {
        li.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1,i=1;
        while(i <= k){
            prod *= li.get(li.size()-i);
            i++;
        }
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */