class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] result=new double[N];
        double temp;
        int temp2;
        for(int i=0; i<N; i++){
            answer[i]=i+1;
        }
        
        for(int i=0; i<N; i++){
            int pass=0;
            int fail=0;
            for(int j=0; j<stages.length; j++){
                if(i<=stages[j]-1){
                    pass++;
                }
                if(i==stages[j]-1){
                    fail++;
                } 
               
            }
             result[i]=(double)fail/pass;
        }
        for(int i=N-1; i>0; i--){
            for(int j=N-1; j>=N-i; j--){
                if(result[j-1]<result[j]){
                    temp=result[j-1];
                    result[j-1]=result[j];
                    result[j]=temp;
                    temp2=answer[j-1];
                    answer[j-1]=answer[j];
                    answer[j]=temp2;
                    
                }
            }
        }
        return answer;
    }
}
