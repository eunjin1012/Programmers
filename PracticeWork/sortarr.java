import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        char[] c = new char[strings.length];
        for(int i=0; i<strings.length; i++){
            char ch = strings[i].charAt(n);
            c[i] = ch;
        }
        Arrays.sort(c);
        boolean[] check = new boolean[c.length];
        for(int i=0; i<strings.length; i++){
          char cd = strings[i].charAt(n);
            for(int j=0; j<c.length; j++){
                if(c[j]==cd && check[j]==false){
                    answer[j] = strings[i];
                    check[j] = true;
                    strings[i] = "";
                    break;
                }
            }
        }
        return answer;
    }
}
