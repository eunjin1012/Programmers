class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String re = "";
        int R=0;
        int T=0;
        int C=0;
        int F=0;
        int J=0;
        int M=0;
        int A=0;
        int N=0;
        
        char c;
        char c2;
        
        String result1="";
        String result2="";
        String result3="";
        String result4="";
        
        
        
        for(int i=0; i<survey.length; i++){
            int su = choices[i];
            
            if(su>0 && su<4){
                char ch = survey[i].charAt(0);
                answer+=String.valueOf(ch);
                if(su==1){
                    re+= "3";
                }
                else if(su==2){
                    re+= "2";
                }
                else if(su==3){
                    re+= "1";
                }
                
            }
            else if(su>4){
                char ch = survey[i].charAt(1);
                answer+=String.valueOf(ch);
                if(su==5){
                    re+= "1";
                }
                else if(su==6){
                    re+= "2";
                }
                else{
                    re+= "3";
                }
            }
            
            }
        
        for(int j=0; j<answer.length(); j++){
              c = answer.charAt(j);
              c2 = re.charAt(j);
              if(c=='R'){
                R+=c2-'0';
              }
              else if(c=='T'){
                T+=c2-'0';
              }
              else if(c=='C'){
                C+=c2-'0';
              }
              else if(c=='F'){
                F+=c2-'0';
              }
              else if(c=='J'){
                J+=c2-'0';
              }
              else if(c=='M'){
                M+=c2-'0';
              }
              else if(c=='A'){
                A+=c2-'0';
              }
              else if(c=='N'){
                N+=c2-'0';
              }
        }
        
      
        if(R>=T){
            result1="R";
        }
        else if(R<T){
            result1="T";
        }
        if(C>=F){
            result2="C";
        }
        else if(C<F){
            result2="F";
        }
        if(J>=M){
            result3="J";
        }
        else if(J<M){
            result3="M";
        }
        if(A>=N){
            result4="A";
        }
        else if(A<N){
            result4="N";
        }
        
        
        return result1+result2+result3+result4;
        
        
        
        }
        
        }
