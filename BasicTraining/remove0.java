class Solution {
    public String solution(String n_str) {
        String answer = "";
        for(int i=0; i<n_str.length(); i++){
            char ch = n_str.charAt(i);
            if(ch!='0'){                       
                for(int j=i; j<n_str.length(); j++){        //0이 아닌 숫자가 나온 곳부터 끝까지 answer에 넣기
                    answer+=n_str.charAt(j);                  
                }
                break;                                      //다시 i반복을 시작하지 않기위해 break로 빠져나온다.
            }
        }
        return answer;
    }
}
