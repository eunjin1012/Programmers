class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        long pi = Long.parseLong(p);
        for(int i=0; i<=t.length()-size; i++){
            String str = t.substring(i, i+size);
            if(Long.parseLong(str)<=pi){
                answer++;
            }
        }
        return answer;
    }
}
