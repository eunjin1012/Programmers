class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int j = 0;
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            answer[j] = ch-'0';
            j++;
        }
        return answer;
    }
}
