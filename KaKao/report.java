import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i=0; i<id_list.length; i++){
            map2.put(id_list[i], i);
            map.put(id_list[i], new HashSet<>());
        }
        for(int j=0; j<report.length; j++){
            String[] name = report[j].split(" ");
            String reporter = name[0];
            String user = name[1];
            map.get(user).add(reporter);
        }
        for(int i=0; i<id_list.length; i++){
            HashSet<String> set = map.get(id_list[i]);
            if(set.size()>=k){
                for(String s : set){
                    answer[map2.get(s)]++;
                }
            }
        }
        return answer;
    }
}
