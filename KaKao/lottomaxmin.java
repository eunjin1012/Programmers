class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int score=0;
        int score2=0;
        int total2;
        int result2;
        
        
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
            score2++;
            }
            else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]){
                        score++;
                        break;
                    }
                }
            }
        }
        
        int total = score+score2;
        int result = score; 
        
        if(total>1){
            answer[0]=7-total;
        }
        else{
            answer[0]=6;
        }
        
        if(result>1){
            answer[1]=7-result;
        }
        else{
            answer[1]=6;
        }
        
        
        
        
        return answer;
    }
}
