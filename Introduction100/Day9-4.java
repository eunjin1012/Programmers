class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        answer = combination(balls, share);
        return answer;
    }
    public static int combination(int a, int b){
        if(a==b || b==0){
            return 1;
        }
        else{
            return combination(a-1, b) + combination(a-1, b-1);
        }
    }
}
