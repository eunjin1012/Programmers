class Solution {
    public String solution(String s) {
        String answer = "";
        int n = 0;
        if(s.length()%2==1){
            n = (s.length()/2);
            answer+=s.charAt(n);
        }
        else{
            n = (s.length()/2);
            answer+=s.charAt(n-1);
            answer+=s.charAt(n);
        }
        return answer;
    }
}
