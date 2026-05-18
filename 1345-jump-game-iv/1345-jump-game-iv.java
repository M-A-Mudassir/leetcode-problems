class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        HashMap<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                List<Integer> li = hm.get(arr[i]);
                li.add(i);
                hm.put(arr[i],li);
            }else{
                List<Integer> li = new ArrayList<>();
                li.add(i);
                hm.put(arr[i],li);
            }
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> que = new LinkedList<>();
        visited[0] = true;
        que.add(0);
        int sum =0;
        while(!que.isEmpty()){
            int s = que.size();
            for(int j=0;j<s;j++){
                int cur = que.remove();
                if(cur == n-1){
                    return sum;
                }
                if(cur-1 >= 0 && !visited[cur-1]){
                    que.add(cur-1);
                    visited[cur-1] = true;
                }
                if(cur+1 < n && !visited[cur+1]){
                    que.add(cur+1);
                    visited[cur+1] = true;
                }
                if(hm.get(arr[cur]).size() > 1){
                    List<Integer> li = hm.get(arr[cur]);
                    for(int i:li){
                        if(i != cur && !visited[i]){
                            que.add(i);
                            visited[i] = true;
                        }
                    }
                    li.clear();
                }
            }
            sum++;
        }
        return -1;
    }
}