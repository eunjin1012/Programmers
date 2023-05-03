class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
            if(i==num_list.length-1){
                int plus = 0;
                if(num_list[i]>num_list[num_list.length-2]){
                    plus = num_list[i] - num_list[num_list.length-2];
                    answer[i+1] = plus;
                }
                else{
                    plus = num_list[i] * 2;
                    answer[i+1] = plus;
                }
            }
        }
        return answer;
    }
}
