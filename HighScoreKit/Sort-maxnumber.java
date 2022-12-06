import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] n = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            n[i]=String.valueOf(numbers[i]);
        }
        
        Arrays.sort(n, new Comparator<String>(){
           
            @Override
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        for(int j=0; j<numbers.length; j++){
            answer+=n[j];
        }
        
        if(n[0].equals("0")){
            answer="0";
        }
        
        return answer;
        
    }
}
