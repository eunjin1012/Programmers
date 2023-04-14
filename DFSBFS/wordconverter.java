class Solution {
    public static int answer = 0;
    public static boolean[] check;
    public int solution(String begin, String target, String[] words) {
        check = new boolean[words.length];
        dfs(begin, target, 0, words);
        return answer;
    }
    public static void dfs(String begin, String target, int result, String[] words){
        if(begin.equals(target)){
            answer = result;
            return;
        }
        else{
            for(int i=0; i<words.length; i++){
                if(check[i]==true){
                    continue;
                }
                int count = 0;
                for(int j=0; j<begin.length(); j++){
                    char ch = begin.charAt(j);
                    char c = words[i].charAt(j);
                    if(ch!=c){
                        count++;
                    }
                }
                if(count==1){
                    check[i] = true;
                    dfs(words[i], target, result+1, words);
                    check[i] = false;
                }
            }
        }
    }
}
