class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            if(food[i]!=1){
                int size = food[i]/2;
                for(int j=0; j<size; j++){
                    answer+=i;
                }
            }
        }
        answer+="0";
        for(int i=answer.length()-2; i>=0; i--){
            char ch = answer.charAt(i);
            answer+=ch;
        }
        return answer;
    }
}
