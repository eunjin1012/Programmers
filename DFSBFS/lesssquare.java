class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        int wlocation = 0;
        int hlocation = 0;
        int width2 = 0;
        int height2 = 0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]>width){
                width = sizes[i][0];
                wlocation = i;
            }
            if(sizes[i][1]>height){
                height = sizes[i][1];
                hlocation = i;
            }
        }
        answer = height * width;
        for(int j=0; j<sizes.length; j++){
            int temp = 0;
            if(sizes[wlocation][1]<=width && sizes[wlocation][0]<=height){
                temp = sizes[wlocation][0];
                sizes[wlocation][0] = sizes[wlocation][1];
                sizes[wlocation][1] = temp;
                for(int k=0; k<sizes.length; k++){
                  if(sizes[k][0]>width2){
                  width2 = sizes[k][0];
                  wlocation = k;
                  }
                  if(sizes[k][1]>height2){
                  height2 = sizes[k][1];
                  hlocation = k;
                  }
                }
                if(answer>height2 * width2){
                    answer = height2 * width2;
                }
                height = height2;
                width = width2;
                height2 = 0;
                width2 = 0;
            }
            else if(sizes[hlocation][1]<=width && sizes[hlocation][0]<=height){
                temp = sizes[hlocation][0];
                sizes[hlocation][0] = sizes[hlocation][1];
                sizes[hlocation][1] = temp;
                for(int k=0; k<sizes.length; k++){
                    if(sizes[k][0]>width2){
                        width2 = sizes[k][0];
                        wlocation = k;
                    }
                    if(sizes[k][1]>height2){
                        height2 = sizes[k][1];
                        hlocation = k;
                    }
                }
                if(answer>height2 * width2){
                    answer = height2 * width2;
                }
                height = height2;
                width = width2;
                height2 = 0;
                width2 = 0;
            }
        }
        return answer;
    }
}
