class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if(M==0 && N==0){
            answer = 0;
        }
        else{
            int length = M-1;
            int height = (M) * (N-1);
            answer = length + height;
        }
        return answer;
    }
}
