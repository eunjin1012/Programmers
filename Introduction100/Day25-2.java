class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total/num;
        for(int i=0; i<num; i++){
            if(num%2==0){
                answer[num/2-1] = mid;
                if(i!=num/2-1){
                    if(i<num/2-1){
                       answer[i] = mid-((num/2-1)-i); 
                    }
                    else{
                        answer[i] = mid+(i-(num/2-1));
                    }
                }
            }
            else{
                answer[num/2] = mid;
                if(i!=num/2){
                    if(i<num/2){
                        answer[i] = mid-((num/2)-i);
                    }
                    else{
                        answer[i] = mid+(i-(num/2));
                    }
                }
            }
        }
        return answer;
    }
}
