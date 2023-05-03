class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String str = "";
        String s = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                str+=String.valueOf(num_list[i]);
            }
            else{
                s+=String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(str) + Integer.parseInt(s);
        return answer;
    }
}
