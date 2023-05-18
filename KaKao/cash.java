import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LinkedList<String> list = new LinkedList<String>();
        if(cacheSize == 0){
            answer = 5 * cities.length;
            return answer;
        }
        for(int i=0; i<cities.length; i++){
            cities[i] = cities[i].toUpperCase();
            if(list.contains(cities[i])){
                list.remove(cities[i]);
                list.add(cities[i]);
                answer += 1;
            }
            else{
                if(cacheSize==list.size()){
                    list.remove(0);
                    list.add(cities[i]);
                    answer += 5;
                }
                else{
                    list.add(cities[i]);
                    answer += 5;
                }
            }
        }
        return answer;
    }
}
