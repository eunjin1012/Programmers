class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int result = 0;
        int total = 0;
        String[] str = polynomial.split(" ");
        for(int i=0; i<str.length; i++){
            String s = str[i];
            if(s.equals("x")){
                result+=1;
            }
           else if(s.contains("x")){
                result+=Integer.parseInt(s.substring(0, s.length()-1));
            }
            else if(!s.contains("+")){
                total+=Integer.parseInt(s);
            }
        }
        if(result!=0 && total==0){
            if(result==1){
                answer+="x";
            }
            else{
                answer = String.valueOf(result) + "x";
            }
        }
        else if(result!=0 && total!=0){
            if(result==1){
                answer = "x + " + total;
            }
            else{
                answer = String.valueOf(result) + "x + " + total;
            }
        }
        else if(total!=0 && result==0){
            answer+=String.valueOf(total);
        }
        return answer;
    }
}
