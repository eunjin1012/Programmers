import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer={};
        int number=13;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(number!=arr[i]){
                list.add(arr[i]);
                number=arr[i];
            }
        }
        
        answer = new int[list.size()];
        for(int j=0; j<answer.length; j++){
            answer[j]=list.get(j);
        }
        

        return answer;
    }
}
