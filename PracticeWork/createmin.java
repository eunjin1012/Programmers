import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int i=0; i<B.length; i++){
            pq.add(B[i]);
        }
        for(int i=0; i<A.length; i++){
            answer += A[i] * pq.poll();
        }
        return answer;
    }
}
