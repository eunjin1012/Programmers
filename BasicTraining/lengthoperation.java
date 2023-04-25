class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int length = num_list.length;
        if(length>=11){
            answer = answer-1;
            for(int i=0; i<num_list.length; i++){
                answer+=num_list[i];
            }
        }
        else{
            for(int i=0; i<num_list.length; i++){
                answer*=num_list[i];
            }
        }
        return answer;
    }
}
