class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = ucl(n, m);
        answer[1] = n * m / ucl(n, m);
        return answer;
    }
    public static int ucl(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }
}
