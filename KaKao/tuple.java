import java.util.*;

class Solution {
    public int[] solution(String s) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] str = s.split("},");
        for(int i=0; i<str.length; i++){
            str[i] = str[i].replace("}", "");
            str[i] = str[i].replace("{", "");
        }
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        for(String sb : str){
            String[] abc = sb.split(",");
            for(int i=0; i<abc.length; i++){
                int n = Integer.parseInt(abc[i]);
                if(!list.contains(n)){
                    list.add(n);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
