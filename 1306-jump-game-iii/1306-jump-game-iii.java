class Solution {
    public boolean calcul(int[] arr,int st,boolean[] visited){
        if(st < arr.length && st >= 0 && !visited[st]){
            if(arr[st] == 0){
                return true;
            }
            visited[st] = true;
            return calcul(arr,st+arr[st],visited)||calcul(arr,st - arr[st],visited);
        }
        return false;
    }
    public boolean canReach(int[] arr, int start) {
        int n  = arr.length;
        boolean[] visited = new boolean[n];
        if(arr[start] == 0)return true;
        visited[start] = true;
        return calcul(arr,start+arr[start],visited)||calcul(arr,start - arr[start],visited);
    }
}