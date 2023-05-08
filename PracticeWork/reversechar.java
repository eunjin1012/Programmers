import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] str = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            str[i] = ch;
        }
        Arrays.sort(str);
        answer = new StringBuilder(new String(str)).reverse().toString();
        return answer;
    }
}
