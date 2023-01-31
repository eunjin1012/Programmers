import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[][] result = new int[emergency.length][2];
        int[] total = new int[emergency.length];
        int count = emergency.length;
        for(int i=0; i<emergency.length; i++){
            answer[i] = emergency[i];
        }
        Arrays.sort(answer);
        for(int j=0; j<result.length; j++){
            result[j][0] = answer[j];
            result[j][1] = count;
            count--;
        }
        for(int k=0; k<result.length; k++){
            for(int q=0; q<result.length; q++){
                if(result[k][0]==emergency[q]){
                    total[q] = result[k][1];
                }
            }
        }
        return total;
    }
}
