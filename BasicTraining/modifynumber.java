class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(int i=0; i<control.length(); i++){
            char ch = control.charAt(i);
            if(ch=='w'){
                n = n + 1;
            }
            else if(ch=='s'){
                n = n - 1;
            }
            else if(ch=='d'){
                n = n + 10;
            }
            else{
                n = n - 10;
            }
        }
        answer = n;
        return answer;
    }
}
