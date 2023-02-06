class Solution {
    public int solution(int chicken) {
        int answer = 0;
        while(chicken>=10){
            answer+=chicken/10;
            int divide = chicken/10;
            int reminder = chicken%10;
            chicken = divide + reminder;
        }
        return answer;
    }
}
