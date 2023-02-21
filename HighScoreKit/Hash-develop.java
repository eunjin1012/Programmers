import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<progresses.length; i++){
            if((100 - progresses[i]) % speeds[i] == 0){
                int day = (100 - progresses[i]) / speeds[i];
                queue.add(day);
            }
            else{
                int days = (100 - progresses[i]) / speeds[i] + 1;
                queue.add(days);
            }
        }
        int one = queue.poll();
        int count = 1;
        while(!queue.isEmpty()){
            if(one>=queue.peek()){
                count++;
                queue.poll();
            }
            else{
                list.add(count);
                count = 1;
                one = queue.poll();
            }
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}
