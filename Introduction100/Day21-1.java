class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] result = my_string.replaceAll("[A-Z|a-z]", " ").split(" ");
        for(int i=0; i<result.length; i++){
            if(result[i].matches("[0-9]+")){
                answer+=Integer.parseInt(result[i]);
            }
        }
        return answer;
    }
}
