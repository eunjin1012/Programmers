class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int lotation = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
                lotation = i;
            }
        }
        answer[0] = max;
        answer[1] = lotation;
        return answer;
    }
}
