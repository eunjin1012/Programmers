import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> cloth = new HashMap<>();
        
        for(String[] cl : clothes){
            String c = cl[1];
            cloth.put(c, cloth.getOrDefault(c, 0)+1);
            
        }
        
        Iterator<Integer> it = cloth.values().iterator();
        
        while(it.hasNext()){
            answer*=it.next().intValue()+1;
        }
        return answer-1;
    }
}
