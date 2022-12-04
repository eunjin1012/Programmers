import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer;
        int possible = nums.length/2;
        
        HashSet<Integer> pd = new HashSet<>();
        
        for(int n : nums){
            pd.add(n);
        }
        
        if(possible>pd.size()){
            answer=pd.size();
        }
        else{
            answer=possible;
        }
        return answer;
    }   
}
