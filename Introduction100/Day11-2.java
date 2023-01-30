class Solution {
    public int solution(int n) {
        int result = 0;
        for(int i=1; i<=n; i++){
            int answer = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    answer++;
                }
            }
            if(answer>=3){
                result++;
            }
        }
        return result;
    }
}
