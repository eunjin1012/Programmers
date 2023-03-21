import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        Stack<Character> stack = new Stack<Character>();
        char c = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(stack.isEmpty()){
                stack.add(ch);
            }
            else if(!stack.isEmpty()){
                if(stack.peek()==ch){
                    stack.pop();
                }
                else{
                    stack.add(ch);
                }
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        
        return answer;
    }
}
