class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int length = 0;                            //배열의 합 저장할 변수
        int length2 = 0;               
        if(arr1.length==arr2.length){              //두 배열의 크기가 같을 때
            for(int i=0; i<arr1.length; i++){
                length += arr1[i];                 //첫 번째 배열의 합 저장
                length2 += arr2[i];                //두 번째 배열의 합 저장
            }
            if(length>length2){
                answer = 1;
            }
            else if(length<length2){
                answer = -1;
            }
        }
        else{                                      //배열의 크기가 다를 때
            if(arr1.length<arr2.length){
                answer = -1;
            }
            else if(arr1.length>arr2.length){
                answer = 1;
            }
        }
        return answer;
    }
}
