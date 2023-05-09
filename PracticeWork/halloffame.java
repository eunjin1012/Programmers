class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] test = new int[k];
        int min = 2000;
        for(int i=0; i<score.length; i++){
            if(i<k){
                test[i] = score[i];
                answer[i] = min;
                if(min>=score[i]){
                    min = score[i];
                    answer[i] = min;
                }
            }
            else{
                for(int j=0; j<test.length; j++){
                    if(min<=score[i]){
                        if(test[j]==min){
                            test[j] = score[i];
                            min = test[j];
                            answer[i] = min;
                        }
                    }
                  if(j==test.length-1){
                    for(int q=0; q<test.length; q++){
                      if(min>=test[q]){
                        answer[i] = test[q];
                        min = test[q];
                      }
                    }
                  }
                }
            }
        }
        return answer;
    }
}
