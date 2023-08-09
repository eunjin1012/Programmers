import java.math.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = String.valueOf(a) + String.valueOf(b);          //string형태로 바꿔서 a와 b를 저장
        int s = 2 * a * b;                                           //2 * a * b의 값 저장
        int st = Integer.parseInt(str);                              //int형태로 비교하기 위해 string을 int형태로 바꿈
        answer = Math.max(st, s);                                    //math함수를 이용하여 두 수를 비교
        return answer;
    }
}
