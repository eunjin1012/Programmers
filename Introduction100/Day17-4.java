class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String str = quiz[i];
            String[] result = str.split(" ");
            int total = 0;
            total = Integer.parseInt(result[0]);
            for(int j=1; j<result.length; j++){
                if(result[j].equals("+")){
                    total+=Integer.parseInt(result[j+1]);
                }
                else if(result[j].equals("-")){
                    total-=Integer.parseInt(result[j+1]);
                }
            }
            int same = Integer.parseInt(result[result.length-1]);
            if(total==same){
                answer[i] = "O";
            }
            else{
                answer[i] = "X";
            }
        }
        return answer;
    }
}
