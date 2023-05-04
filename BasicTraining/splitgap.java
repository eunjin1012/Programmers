import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(!answer[i].isEmpty()){
                list.add(answer[i]);
            }
        }
        String[] str = new String[list.size()];
        for(int i=0; i<str.length; i++){
            str[i] = list.get(i);
        }
        return str;
    }
}
