class Solution {
    public int[][] solution(int[] num_list, int n) {
        int arr = num_list.length/n;
        int[][] answer = new int[arr][n];
        int k=0;
        for(int i=0; i<arr; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[k];
                k++;
            }
        }
        return answer;
    }
}
