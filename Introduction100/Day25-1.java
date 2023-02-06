class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String a = A;
        for(int i=0; i<A.length(); i++){
            if(a.equals(B)){
                break;
            }
            else{
                char ch = a.charAt(a.length()-1);
                a = ch + a.substring(0, a.length()-1);
                answer++;
            }
        }
        if(!a.equals(B)){
            answer = -1;
        }
        return answer;
    }
}
