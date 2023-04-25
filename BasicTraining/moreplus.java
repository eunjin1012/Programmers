class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sta = String.valueOf(a);
        String stb = String.valueOf(b);
        String str1 = sta + stb;
        String str2 = stb + sta;
        if(Integer.parseInt(str1)>Integer.parseInt(str2)){
            answer = Integer.parseInt(str1);
        }
        else{
            answer = Integer.parseInt(str2);
        }
        return answer;
    }
}
