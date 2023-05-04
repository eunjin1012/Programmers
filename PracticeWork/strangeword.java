class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int count = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].equals(" ")){
                answer+=str[i];
                count = 0;
            }
            else{
                count++;
                if(count%2==0){
                    str[i] = str[i].toLowerCase();
                    answer+=str[i];
                }
                else{
                    str[i] = str[i].toUpperCase();
                    answer+=str[i];
                }
            }
        }
        return answer;
    }
}
