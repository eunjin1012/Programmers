import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String str = s;
        for(int i=0; i<s.length(); i++){
            if(check(str)){
                answer++;
            }
            str = str.substring(1, s.length()) + str.charAt(0);
        }
        return answer;
    }
    static boolean check(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int j=0; j<str.length(); j++){
            char ch = str.charAt(j);
            if(ch=='['){
                stack.push(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch=='{'){
                stack.push(ch);
            }
            else if(ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.peek()!='['){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.peek()!='{'){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                else if(stack.peek()!='('){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
