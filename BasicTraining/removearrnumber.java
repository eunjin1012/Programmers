import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==delete_list[j]){                    
                    arr[i] = 0;                            //delete_list의 원소와 arr의 원소가 같으면 arr의 원소를 0으로 바꾼다.(숫자는 1부터 시작하므로 관계없는 0으로 설정)
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();      //몇 개의 원소가 0으로 바뀔지 모르기 때문에 list로 선언
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                list.add(arr[i]);                                //원소가 바꿔놓은 0이 아니라면 delete_list에 없는 수이기 때문에 list에 넣기
            }
        }
        int[] answer = new int[list.size()];                    
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);                            //answer배열에 list의 값들을 넣기
        }
        return answer;
    }
}
