class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for(int i : numbers){
            if(i==1 || i==4 || i==7){
                answer+="L";
                left = i;
            }
            else if(i==3 || i==6 || i==9){
                answer+="R";
                right = i;
            }
            else if(i==2 || i==5 || i==8 || i==0){
                if(i==0){
                    i=11;
                }
                int leftdistance = Math.abs(i-left)/3 + Math.abs(i-left)%3;
                int rightdistance = Math.abs(i-right)/3 + Math.abs(i-right)%3;
                
                if(leftdistance>rightdistance){
                    answer+="R";
                    right = i;
                }
                else if(leftdistance<rightdistance){
                    answer+="L";
                    left = i;
                }
                else if(leftdistance == rightdistance){
                    if(hand.contains("right")){
                        answer+="R";
                        right = i;
                    }
                    else if(hand.contains("left")){
                        answer+="L";
                        left = i;
                    }
                }
            }
        }
        
        return answer;
    }
}
