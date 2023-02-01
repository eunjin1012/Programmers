import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int llength = 256;
        int rlength = -256;
        int dheight = 256;
        int uheight = -256;
        
        for(int i=0; i<dots.length; i++){
            if(dots[i][0]<=llength){
                llength = dots[i][0];
            }
            if(dots[i][0]>=rlength){
                rlength = dots[i][0];
            }
            if(dots[i][1]<=dheight){
                dheight = dots[i][1];
            }
            if(dots[i][1]>=uheight){
                uheight = dots[i][1];
            }
        }
        answer = Math.abs(rlength-llength) * Math.abs(uheight-dheight);
        return answer;
    }
}
