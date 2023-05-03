class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            char ch2 = str2.charAt(i);
            answer+=ch;
            answer+=ch2;
        }
        return answer;
    }
}
