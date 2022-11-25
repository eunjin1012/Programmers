class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String str="";
        int number=0;
        int[] arr=new int[3];
        int j=0;
        
        
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            if(ch>='0' && ch<='9'){
                str+=String.valueOf(ch);  
            }
            else if(ch=='S'){
                number = Integer.parseInt(str);
                arr[j++]=number;
                str="";
                
            }
            else if(ch=='D'){
                number = Integer.parseInt(str)*Integer.parseInt(str);
                arr[j++]=number;
                str="";
            }
            else if(ch=='T'){
                number = Integer.parseInt(str)*Integer.parseInt(str)*Integer.parseInt(str);
                arr[j++]=number;
                str="";
            }
            else if(ch=='*'){
                arr[j-1]*=2;
                if(j-2>=0){
                    arr[j-2]*=2;
                }
            }
            else if(ch=='#'){
                arr[j-1]*=(-1);
                
            }
        }
        
        for(int i=0; i<3; i++){
            answer+=arr[i];
        }
        return answer;
    }
}
