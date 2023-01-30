import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String str = "";
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)){
                answer+=Character.toLowerCase(ch);
            }
            else{
                answer+=ch;
            }
            
        }
        char[] result = new char[answer.length()];
        for(int j=0; j<answer.length(); j++){
            char c = answer.charAt(j);
            result[j] = c;
        }
        Arrays.sort(result);
        for(int k=0; k<result.length; k++){
            str+=result[k];
        }
        return str;
    }
}
