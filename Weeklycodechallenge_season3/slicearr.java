import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right - left) + 1;
        int[] answer = new int[size];
        int count = 0;
        for(long i=left; i<=right; i++){
            long row = (i/n) + 1;
            long col = (i%n) + 1;
            answer[count] = Math.max((int)row, (int)col);
            count++;
        }
        return answer;
    }
}
