package programmers.level_4;

import java.util.HashMap;

public class 호텔방배정 {
    class Solution {
        HashMap<Long,Long> map = new HashMap<>();
        public long[] solution(long k, long[] room_number) {
            long [] answer = new long[room_number.length];
            for(int i=0; i<answer.length; i++){
                answer[i] = findRoom(room_number[i]);
            }

            return answer;
        }
        public long findRoom(long room){
            if(!map.containsKey(room)){
                map.put(room,room+1);
                return room;
            }
            long nextRoom = map.get(room);
            long emptyRoom = findRoom(nextRoom);
            map.put(room,emptyRoom);
            return emptyRoom;
        }

    }
}
