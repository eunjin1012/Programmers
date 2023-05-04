class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            char ch = phone_number.charAt(i);
            ch = '*';
            answer+=ch;
        }
        for(int j=phone_number.length()-4; j<phone_number.length(); j++){
            char ch = phone_number.charAt(j);
            answer+=ch;
        }
        return answer;
    }
}
