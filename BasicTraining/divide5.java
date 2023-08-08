import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> list = new ArrayList<>();          //이름을 넣을 리스트 선언
        for(int i=0; i<names.length; i+=5){                  //5명씩 자른다
            list.add(names[i]);                              //리스트에 이름 넣기
        }
        String[] answer = new String[list.size()];         
        for(int i=0; i<list.size(); i++){      
            answer[i] = list.get(i);                        //리스트에 있는 문자열들을 배열로 가져오기
        }
        return answer;
    }
}
