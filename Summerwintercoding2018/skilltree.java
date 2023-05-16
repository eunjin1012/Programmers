class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean[] check = new boolean[skill_trees.length];
        for(int j=0; j<skill_trees.length; j++){
          boolean[] b = new boolean[skill.length()];
            int store = 0;
            for(int i=0; i<skill.length(); i++){
                char ch = skill.charAt(i);
                for(int k=0; k<skill_trees[j].length(); k++){
                    char c = skill_trees[j].charAt(k);
                    if(c==ch){
                        if(store<=k){
                          if(i!=0 && b[i-1] == true){
                            store = k;
                            b[i] = true;
                            break;
                          }
                          else if(i==0){
                            store = k;
                            b[i] = true;
                            break;
                          }
                          else{
                            check[j] = true;
                            break;
                          }
                        }
                        else{
                            check[j] = true;
                            break;
                        }
                    }
                }
            }
        }
        for(int i=0; i<check.length; i++){
            if(check[i]==false){
                answer++;
            }
        }
        return answer;
    }
}
