import java.util.*;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=2; i<=n; i++){
            int count = 0;
            for(int j=2; j<=i; j++){
                while(n%j==0){
                    if(i%j==0){
                        set.add(i);
                        n = n/i;
                    }
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
