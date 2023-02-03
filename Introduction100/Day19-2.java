class Solution {
    public String[] solution(String my_str, int n) {
        int size = 0;
        if(my_str.length()%n==0){
            size = my_str.length()/n;
        }
        else{
            size = my_str.length()/n+1;
        }
        String[] answer = new String[size];
        for(int i=0; i<size; i++){
            if(i==size-1){
                answer[i] = my_str.substring(i*n, my_str.length());
            }
            else{
                answer[i] = my_str.substring(i*n, i*n+n);
            }
        }
        return answer;
    }
}
