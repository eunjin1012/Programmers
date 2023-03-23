import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<String, String>();
        int count = 0;
        for(int i=0; i<record.length; i++){
            String[] str = record[i].split(" ");
            if(str[0].equals("Enter")){
                map.put(str[1], str[2]);
            }
            else if(str[0].equals("Change")){
                map.put(str[1], str[2]);
                count++;
            }
        }
        String[] answer = new String[record.length-count];
        int score = 0;
        for(int i=0; i<record.length; i++){
            String[] name = record[i].split(" ");
            String id = map.get(name[1]);
            
            if(name[0].equals("Enter")){
                answer[score++] = id + "님이 들어왔습니다.";
            }
            else if(name[0].equals("Leave")){
                answer[score++] = id + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}
