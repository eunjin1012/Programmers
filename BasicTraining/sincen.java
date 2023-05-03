class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = num_list.length - n;
        int[] answer = new int[size+1];
        int m = 0;
        for(int i=n-1; i<num_list.length; i++){
            answer[m] = num_list[i];
            m++;
        }
        return answer;
    }
}
