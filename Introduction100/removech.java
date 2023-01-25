class Solution {
    public String solution(String my_string) {
        String answer = "";
        char a = 'a';
        char b = 'e';
        char c = 'i';
        char d = 'o';
        char e = 'u';
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(ch==a || ch==b || ch==c || ch==d || ch==e){
                answer+="";
            } 
            else{
                answer+=ch;
            }
        }
        return answer;
    }
}
