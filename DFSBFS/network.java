class Solution {
    public static boolean[] check;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n];
        for(int i=0; i<n; i++){
            if(check[i]==false){
                answer++;
                dfs(i, computers, n);
            }
        }
        return answer;
    }
    public static void dfs(int k, int[][] computers, int n){
        check[k] = true;
        
        for(int j=0; j<n; j++){
            if(check[j]==false && computers[k][j]==1){
                dfs(j, computers, n);
            }
        }
    }
}
