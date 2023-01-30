import java.util.*;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int result = 0;
        int length = (int)(Math.log10(num)+1);
        int[] arr = new int[length];
        int[] number = new int[length];
        for(int i=0; i<arr.length; i++){
                arr[i] = num % 10;
                num = num/10;
         }
        for(int j=arr.length-1; j>=0; j--){
            number[answer] = arr[j];
            answer++;
        }
        for(int q=0; q<number.length; q++){
            if(number[q] == k){
                result = q+1;
                break;
            }
        }
        if(result == 0){
            result = -1;
        }
        return result;
    }
}
