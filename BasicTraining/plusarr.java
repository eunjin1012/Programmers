class Solution {
    public int[] solution(int[] arr) {
        int size = 0;
        for(int i=0; i<arr.length; i++){
            size+=arr[i];
        }
        int[] answer = new int[size];
        int k = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[k] = arr[i];
                k++;
            }
        }
        return answer;
    }
}
