class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] result = new int[board.length][board.length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]==1){
                    check(i, j, board.length, result);
                }
            }
        }
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result.length; j++){
                if(result[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void check(int a, int b, int n, int[][] re){
        for(int k=a-1; k<=a+1; k++){
            if(k<0 || k>=n){
                continue;
            }
            else{
                for(int q=b-1; q<=b+1; q++){
                    if(q<0 || q>=n){
                        continue;
                    }
                    else{
                        re[k][q] = 1;
                    }
                }
            }
        }
    }
}
