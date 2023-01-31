import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int max = 200;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            int m = Math.abs(n-array[i]);
            if(max>m){
                max = m;
                answer = array[i];
            }
        }
        return answer;
    }
}
