package programmers.level_2;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.substring(1,s.length()-2);
        HashMap<String,Integer> map = new HashMap<>();

        for(String a : s.split("},")){
            a= a.substring(1,a.length());
            map.put(a,a.length());
        }

        Set<String> set = new LinkedHashSet<String>();

        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (v1, v2) -> (map.get(v1).compareTo(map.get(v2))));

        for (String key : keys) {
            for(String k : key.split(",")){
                set.add(k);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        Iterator<String> iter = set.iterator();

        while(iter.hasNext()) {
            list.add(iter.next());

        }
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = Integer.parseInt(list.get(i));
        }

        return answer;
    }
}