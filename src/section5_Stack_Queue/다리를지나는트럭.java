package section5_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        int bridge_length=2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        int nowWeight=0;
        int answer=0;
        Queue<Integer> queue = new LinkedList<>();
        for(int truck : truck_weights){
            while(true){
                if(queue.isEmpty()){
                    queue.offer(truck);
                    nowWeight+=truck;
                    answer++;
                    break;
                }else{
                    if(queue.size() == bridge_length){ // 트럭이 다 찼다면
                        nowWeight-=queue.poll();
                    }else if(nowWeight + truck <= weight){
                        queue.offer(truck);
                        nowWeight+=truck;
                        answer++;
                        break;
                    }else{
                        queue.offer(0);
                        answer++;
                    }
                }
            }
        }
    }
}
