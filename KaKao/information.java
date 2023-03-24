import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        String[] str = today.split("[.]");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        int count = (year * 12 * 28) + (month * 28) + day;
        for(int i=0; i<terms.length; i++){
            String[] rank = terms[i].split(" ");
            for(int j=0; j<privacies.length; j++){
                String[] date = privacies[j].split(" ");
                if(rank[0].equals(date[1])){
                    String[] calender = date[0].split("[.]");
                    int y = Integer.parseInt(calender[0]);
                    int m = Integer.parseInt(calender[1]);
                    int d = Integer.parseInt(calender[2]);
                    m = m + Integer.parseInt(rank[1]);
                    int count2 = (y * 12 * 28) + (m * 28) + d-1;
                    if(count>count2){
                        list.add(j+1);
                    }
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
