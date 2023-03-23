class Solution {
    public int solution(int n) {
        int answer;
        String s;
        String str = "";
        s = Integer.toString(n, 3);
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            str+=ch;
        }
        answer = Integer.parseInt(str, 3);
        return answer;
    }
}
