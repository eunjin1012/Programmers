import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String result = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int count = 0;
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(c==ch){
                    count++;
                }
            }
            if(count==1){
                answer+=ch;
            }
        }
        char[] str = new char[answer.length()];
        for(int k=0; k<answer.length(); k++){
            char chc = answer.charAt(k);
            str[k] = chc;
        }
        Arrays.sort(str);
        
        for(int i=0; i<str.length; i++){
            result+=str[i];
        }
        return result;
    }
}
