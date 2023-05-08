class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] str = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean check = false;
            for(int j=str.length-1; j>=0; j--){
                if(ch==str[j]){
                    answer[i] = i-j;
                    str[i] = ch;
                    check = true;
                    break;
                }
            }
            if(check==false){
                str[i] = ch;
                answer[i] = -1;
            }
        }
        return answer;
    }
}
