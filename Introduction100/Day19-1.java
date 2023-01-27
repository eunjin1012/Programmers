class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String result = "";
        for(int i=0; i<array.length; i++){
            result+=array[i];
        }
        for(int i=0; i<result.length(); i++){
            char ch = result.charAt(i);
            if(ch=='7'){
                answer++;
            }
        }
        return answer;
    }
}
