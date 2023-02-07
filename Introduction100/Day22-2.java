class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if(num(dots[0], dots[1])==num(dots[2], dots[3])){
            answer = 1;
        }
        else if(num(dots[0], dots[2])==num(dots[1], dots[3])){
            answer = 1;
        }
        else if(num(dots[0], dots[3])==num(dots[1], dots[2])){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
    public static double num(int[] a, int[] b){
        return (double)(b[1]-a[1]) / (b[0]-a[0]);
    }
}
