import java.util.*;

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        double d = Math.pow(2, t);
        int da = (int)d;
        answer = n * da;
        return answer;
    }
}
