class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int llength = -board[0]/2;
        int rlength = board[0]/2;
        int uheight = board[1]/2;
        int dheight = -board[1]/2;
        int[] answer = new int[2];
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].contains("left")){
                if(answer[0]>llength){
                    answer[0]--;
                }
            }
            else if(keyinput[i].contains("right")){
                if(answer[0]<rlength){
                    answer[0]++;
                }
            }
            else if(keyinput[i].contains("up")){
                if(answer[1]<uheight){
                    answer[1]++;
                }
            }
            else if(keyinput[i].contains("down")){
                if(answer[1]>dheight){
                    answer[1]--;
                }
            }
        }
        return answer;
    }
}
