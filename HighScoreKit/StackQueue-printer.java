import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0; i<priorities.length; i++){
            queue.add(priorities[i]);
        }
        
        while(!queue.isEmpty()){
            for(int j=0; j<priorities.length; j++){
                if(queue.peek()==priorities[j]){
                    if(j==location){
                        answer++;
                        return answer;
                    }
                    else{
                        queue.poll();
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
