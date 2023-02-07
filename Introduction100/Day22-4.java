class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int bottom = b / gcd(a, b);
        while(bottom!=1){
            if(bottom%2==0){
                bottom = bottom/2;
            }
            else if(bottom%5==0){
                bottom = bottom/5;
            }
            else{
                answer = 2;
                break;
            }
        }
        return answer;
    }
    public static int gcd(int n, int m){
        while(m>0){
            int reminder = n % m;
            n = m;
            m = reminder;
        }
        return n;
    }
}
