class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        char num = (char)(k+'0');
        for(int start = i; start<=j; start++){
            str+=String.valueOf(start);
        }
        for(int q=0; q<str.length(); q++){
            char ch = str.charAt(q);
            if(ch==num){
                answer++;
            }
        }
        return answer;
    }
}
