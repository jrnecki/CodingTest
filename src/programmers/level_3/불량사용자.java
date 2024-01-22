package programmers.level_3;

import java.util.Arrays;
import java.util.HashSet;

public class 불량사용자 {
    HashSet<String> answer;
    String[] userIds;
    String[] bannedIds;
    boolean[] visited;
    public int solution(String[] user_id, String[] banned_id) {
        userIds = user_id;
        bannedIds = banned_id;
        visited = new boolean[user_id.length];

        answer = new HashSet<>();
        makeCombi(0,"");
        return answer.size();
    }

    public void makeCombi(int depth, String result){
        if(depth == bannedIds.length){
            String [] ids = result.split(" ");
            Arrays.sort(ids);

            String str = "";
            for(String id : ids){
                str+=id;
            }
            answer.add(str);
            return;
        }

        for(int i=0; i<userIds.length; i++){
            if(!visited[i] && check(userIds[i],bannedIds[depth])){
                visited[i] = true;
                makeCombi(depth+1,userIds[i]+" "+result);
                visited[i] = false;
            }
        }

    }
    public boolean check(String userId, String bannedId){
        if(userId.length() != bannedId.length()){
            return false;
        }
        for(int i=0; i<userId.length(); i++){
            if(userId.charAt(i) != bannedId.charAt(i) && bannedId.charAt(i)!='*'){
                return false;
            }
        }
        return true;
    }
}
