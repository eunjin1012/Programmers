class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=1; i<=cipher.length(); i++){
            char ch = cipher.charAt(i-1);
            if(i%code==0){
                answer+=ch;
            }
        }
        return answer;
    }
}
