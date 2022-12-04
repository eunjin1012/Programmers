import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> pc = new HashMap<>();
        
        for(String people : participant) pc.put(people, pc.getOrDefault(people, 0)+1);
        for(String people : completion) pc.put(people, pc.get(people)-1);
        
        for(String key : pc.keySet()){
            if(pc.get(key)!=0){
                answer=key;
                break;
            }
        }
        
        return answer;
    }
}
