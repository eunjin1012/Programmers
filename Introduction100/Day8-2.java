class Solution {
    public String solution(int age) {
        String answer = "";
        String result = "";
        int count = 0;
        while(age>0){
            int alphabet = age%10;
            switch(alphabet){
                case 0 : answer+="a"; break;
                case 1 : answer+="b"; break;
                case 2 : answer+="c"; break;
                case 3 : answer+="d"; break;
                case 4 : answer+="e"; break;
                case 5 : answer+="f"; break;
                case 6 : answer+="g"; break;
                case 7 : answer+="h"; break;
                case 8 : answer+="i"; break;
                case 9 : answer+="j"; break;
        }
            age = age/10;
        }
        for(int i=answer.length()-1; i>=0; i--){
            char ch = answer.charAt(i);
            result+=ch;
        }
        return result;
    }
}
