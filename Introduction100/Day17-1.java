import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                list.add(numlist[i]);
            }
        }
        answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        return answer;
    }
}
