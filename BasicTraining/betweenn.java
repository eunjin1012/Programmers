class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = 0;
        if(num_list.length%n==0){
            size = num_list.length/n;
        }
        else{
            size = num_list.length/n + 1;
        }
        int[] answer = new int[size];
        int j = 0;
        for(int i=0; i<num_list.length; i+=n){
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}
