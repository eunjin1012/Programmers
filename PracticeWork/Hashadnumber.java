class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int number = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            number+=ch-'0';
        }
        if(x%number==0){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}
