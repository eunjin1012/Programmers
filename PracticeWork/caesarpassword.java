class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch==' '){
                answer+=ch;
            }
            else{
                if(ch<=90){
                    ch+=n;
                    if(ch>90){
                        ch -= 26;
                    }
                    answer+=ch;
                }
                else{
                    ch+=n;
                    if(ch>122){
                        ch -= 26;
                    }
                    answer+=ch;
                }
            }
        }
        return answer;
    }
}
