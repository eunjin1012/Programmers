class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isLowerCase(ch)){
                ch = Character.toUpperCase(ch);
                answer+=ch;
            }
            else if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
                answer+=ch;
            }
            
        }
        return answer;
    }
}
