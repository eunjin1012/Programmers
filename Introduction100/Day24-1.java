import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int result = 0;
        char[] b = new char[before.length()];
        char[] a = new char[after.length()];
        for(int i=0; i<before.length(); i++){
            char ch = before.charAt(i);
            b[i] = ch;
        }
        for(int j=0; j<after.length(); j++){
            char c = after.charAt(j);
            a[j] = c;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int k=0; k<b.length; k++){
            if(b[k]==a[k]){
                answer++;
            }
        }
        if(answer==after.length()){
            result = 1;
        }
        return result;
    }
}
