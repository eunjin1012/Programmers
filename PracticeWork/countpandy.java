class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='P'){
                p++;
            }
            else if(ch=='Y'){
                y++;
            }
        }
        if(p==y){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}
