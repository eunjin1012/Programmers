class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1; i<=s.length()/2; i++){
            String str = s.substring(0, i);
            int count = 1;
            String result = "";
            for(int j=i; j<s.length(); j+=i){
                String replace = "";
                if(j+i>=s.length()){
                    replace = s.substring(j, s.length());
                }
                else{
                    replace = s.substring(j, j+i);
                }
                if(str.equals(replace)){
                    count++;
                    str = replace;
                }
                else{
                    if(count==1){
                        result+=str;
                        str = replace;
                        count = 1;
                    }
                    else{
                        result+=count;
                        result+=str;
                        str = replace;
                        count = 1;
                    }
                }
                if(j+i>=s.length()){
                    if(count==1){
                        result+=str;
                    }
                    else{
                        result+=count;
                        result+=str;
                    }
                }
            }
            answer = Math.min(answer, result.length());
        }
        return answer;
    }
}
