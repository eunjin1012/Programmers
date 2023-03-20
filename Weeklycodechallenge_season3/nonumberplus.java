class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] result = new int[10];
        for(int i=0; i<result.length; i++){
            result[i] = -1;
        }
        for(int i=0; i<numbers.length; i++){
            result[numbers[i]] = numbers[i];
        }
        for(int j=0; j<result.length; j++){
            if(result[j]==-1){
                answer+=j;
            }
        }
        return answer;
    }
}
