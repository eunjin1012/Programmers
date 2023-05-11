class Solution {
    public String solution(String s) {
        String answer = "";
        char c = s.charAt(s.length()-1);
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                char ch = arr[i].charAt(j);
                if(j==0){
                    if(ch>='0' && ch<='9'){
                        answer+=ch;
                    }
                    else{
                        ch = Character.toUpperCase(ch);
                        answer+=ch;
                    }
                }
                else{
                    ch = Character.toLowerCase(ch);
                    answer+=ch;
                }
            }
            if(i!=arr.length-1){
                answer+=" ";
            }
        }
        if(c==' '){
            answer+=" ";
        }
        return answer;
    }
}
