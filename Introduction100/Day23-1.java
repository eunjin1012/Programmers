class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            int rank = 1;
            answer[i] = rank;
            for(int j=0; j<score.length; j++){
                if(score[i][0]+score[i][1]<score[j][0]+score[j][1]){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
