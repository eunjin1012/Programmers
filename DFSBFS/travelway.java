import java.util.*;

class Solution {
    public static boolean[] check;
    public static ArrayList<String> list = new ArrayList<String>();
    public String[] solution(String[][] tickets) {
        check = new boolean[tickets.length];
        dfs(tickets, 0, "ICN", "ICN");
        Collections.sort(list);
        return list.get(0).split(" ");
    }
    public static void dfs(String[][] tickets, int n, String location, String way){
        if(n==tickets.length){
            list.add(way);
            return;
        }
        else{
            for(int i=0; i<tickets.length; i++){
                if(check[i]==false){
                    if(location.equals(tickets[i][0])){
                        check[i]=true;
                        dfs(tickets, n+1, tickets[i][1], way + " " + tickets[i][1]);
                        check[i] = false;
                    }
                }
            }
        }
    }
}
