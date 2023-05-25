import java.util.*;

class Solution {
    public String solution(String p) {
        String answer = "";
        if(check(p)){
            return p;
        }
        else{
            return translate(p);
        }
    }
    static boolean check(String p){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            if(ch=='('){
                stack.push(ch);
            }
            else{
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
    static String translate(String p){
        if(p.length()==0){
            return p;
        }
        String u = "";
        String v = "";
        int count = 0;
        int count2 = 0;
        for(int j=0; j<p.length(); j++){
            char c = p.charAt(j);
            if(c=='('){
                count++;
            }
            else{
                count2++;
            }
            if(count == count2 && count>0 && count2>0){
                u = p.substring(0, j+1);
                if(j<p.length()-1){
                    v = p.substring(j+1, p.length());
                }
                break;
            }
        }
        if(check(u)){
            return u + translate(v);
        }
        else{
            String str = "(" + translate(v) + ")";
            if(u.length()==2){
                u = "";
            }
            else{
                u = u.substring(1, u.length()-1);
                u = u.replace("(", "0");
                u = u.replace(")", "(");
                u = u.replace("0", ")");
            }
            str = str + u;
            return str;
        }
    }
}
