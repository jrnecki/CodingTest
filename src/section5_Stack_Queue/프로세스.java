package section5_Stack_Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
    public static void main(String[] args) {
        int answer = 0;
        int[] priorities = {2,1,3,2};
        int location = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<priorities.length; i++){
            pq.offer(priorities[i]);
        }
        boolean flag = true;
        while(!pq.isEmpty() && flag){
            for(int i=0; i<priorities.length; i++){
                if(pq.peek() == priorities[i]){
                    pq.poll();
                    answer++;

                    if (location == i) {
                        System.out.println(answer);
                        flag = false;
                    }
                }
            }
        }
    }
}
