class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=10; i++){
            if(factorial(i)==n){
                answer = i;
                break;
            }
            else if(factorial(i)>n){
                answer = i-1;
                break;
            }
        }
        return answer;
    }
    public static int factorial(int a){
        if(a==1){
            return 1;
        }
        else{
            return a * factorial(a-1);
        }
    }
}
