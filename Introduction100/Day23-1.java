class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        for(int i=0; i<numlist.length; i++){
            for(int j=i+1; j<numlist.length; j++){
                if(Math.abs(n-numlist[i])==Math.abs(n-numlist[j])){
                    if(numlist[i]<numlist[j]){
                        int temp = numlist[i];
                        numlist[i] = numlist[j];
                        numlist[j] = temp;
                    }
                }
                else if(Math.abs(n-numlist[i])>Math.abs(n-numlist[j])){
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                }
            }
        }
        for(int i=0; i<numlist.length; i++){
            answer[i] = numlist[i];
        }
        return answer;
    }
}
