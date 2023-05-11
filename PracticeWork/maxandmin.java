class Solution {
    public String solution(String s) {
        String answer = "";
        String[] number = s.split(" ");
        int min = Integer.parseInt(number[0]);
        int max = Integer.parseInt(number[0]);
        for(int i=0; i<number.length; i++){
            if(min>Integer.parseInt(number[i])){
                min = Integer.parseInt(number[i]);
            }
            if(max<Integer.parseInt(number[i])){
                max = Integer.parseInt(number[i]);
            }
        }
        answer+=min;
        answer+=" ";
        answer+=max;
        return answer;
    }
}
