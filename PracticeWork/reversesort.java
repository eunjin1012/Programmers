import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        String s = "";
        char[] arr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[i] = ch;
        }
        Arrays.sort(arr);
        for(int j=arr.length-1; j>=0; j--){
            s+=arr[j];
        }
        answer = Long.parseLong(s);
        return answer;
    }
}
