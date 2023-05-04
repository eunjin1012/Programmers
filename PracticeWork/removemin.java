import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=min){
                list.add(arr[j]);
            }
            if(arr.length==1){
                list.add(-1);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
