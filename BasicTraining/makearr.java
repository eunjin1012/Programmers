class Solution {
    public int[] solution(int n, int k) {
        int size = n/k;
        int[] answer = new int[size];
        int j = 0;
        for(int i=1; i<=size; i++){
            answer[j] = i*k;
            j++;
        }
        return answer;
    }
}
