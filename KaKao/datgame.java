class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int n=0;
        int idx=0;
        int[] result = new int[3];
        String str="";
        
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            
            if(ch >= '0' && ch <= '9'){
                str+=String.valueOf(ch);
            }
            else if(ch=='S'){
                n=Integer.parseInt(str);
                result[idx++]=(int)Math.pow(n,1);
                str="";
            }
            else if(ch=='D'){
                n=Integer.parseInt(str);
                result[idx++]=(int)Math.pow(n, 2);
                str="";
            }
            else if(ch=='T'){
                n=Integer.parseInt(str);
                result[idx++]=(int)Math.pow(n,3);
                str="";
            }
            else if(ch=='#'){
                result[idx-1]*=(-1);
            }
            else{
                result[idx-1]*=2;
                if(idx-2>=0){
                    result[idx-2]*=2;
                }
            }
        }
        answer=result[0]+result[1]+result[2];
        
        return answer;
    }
}
