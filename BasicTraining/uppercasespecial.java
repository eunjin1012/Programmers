class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char c = alp.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(c==ch){
                answer+=Character.toUpperCase(ch);
            }
            else{
                answer+=ch;
            }
        }
        return answer;
    }
}
