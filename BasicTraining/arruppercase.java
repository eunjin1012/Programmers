class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            if((i+1)%2==0){
                strArr[i] = strArr[i].toUpperCase();
                answer[i] = strArr[i];
            }
            else{
                strArr[i] = strArr[i].toLowerCase();
                answer[i] = strArr[i];
            }
        }
        return answer;
    }
}
