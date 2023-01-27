class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int result = 0;
        int up = denom1 * numer2 + numer1 * denom2;
        int bottom = denom1 * denom2;
        for(int i=1; i<=bottom; i++){
            if(bottom%i==0 && up%i==0){
                result = i;
            }
        }
        answer[0] = up/result;
        answer[1] = bottom/result;
        return answer;
    }
}
