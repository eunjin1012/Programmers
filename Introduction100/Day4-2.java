class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%6==0){
            answer+=n/6;
        }
        else{
            int d = n * 6 / gcd(n, 6);
            answer+=d / 6;
        }
        return answer;
    }
    static int gcd(int a, int b){
        while(b>0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
