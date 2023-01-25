class Solution {
    public int solution(String message) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<message.length(); i++){
            count++;
        }
        answer = count*2;
        return answer;
    }
}
