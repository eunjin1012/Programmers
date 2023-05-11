import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        double min = 0;
        double max = 0;
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        for(int i=0; i<str1.length()-1; i++){
            char ch = str1.charAt(i);
            char c = str1.charAt(i+1);
            if(ch>='A' && ch<='Z'){
                if(c>='A' && c<='Z'){
                   list.add(str1.substring(i, i+2)); 
                }
            }
        }
        for(int j=0; j<str2.length()-1; j++){
            char cd = str2.charAt(j);
            char c1 = str2.charAt(j+1);
            if(cd>='A' && cd<='Z'){
                if(c1>='A' && c1<='Z'){
                    list2.add(str2.substring(j, j+2));
                }
            }
        }
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list.get(i).equals(list2.get(j))){
                    min++;
                    list.set(i, "");
                    list2.set(j, "");
                    break;
                }
            }
        }
        if(list.size()==0 && list2.size()==0){
            answer = 65536;
        }
        else{
            max = (list.size() + list2.size()) - min;
            double count = (min / max) * 65536;
            answer = (int)count;
        }
        return answer;
    }
}
