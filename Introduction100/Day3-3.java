class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int result = 0;
        int[] count = new int[1000];
        for(int i=0; i<array.length; i++){
            count[array[i]]++;
        }
        for(int j=0; j<count.length; j++){
            if(count[j]>answer){
                answer = count[j];
                result = j;
            }
            else if(count[j]==answer){
                result = -1;
            }
        }
        return result;
    }
}
