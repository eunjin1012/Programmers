import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]!=0){
                    if(!stack.isEmpty()){
                        if(stack.peek()!=board[j][moves[i]-1]){
                            stack.add(board[j][moves[i]-1]);
                        }
                        else{
                            answer++;
                            stack.pop();
                            answer++;
                        }
                    }
                    else if(stack.isEmpty()){
                        stack.add(board[j][moves[i]-1]);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}
