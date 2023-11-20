package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q8_응급실 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] arr = new int [n];
        st = new StringTokenizer(br.readLine());
        Queue<Person> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            queue.offer(new Person(i,Integer.parseInt(st.nextToken())));
    }
        int answer = 0;
        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person p : queue){
                if(tmp.priority <  p.priority){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                answer++;
                if(tmp.idx == m) break;
            }
        }
        System.out.println(answer);
    }
}
 class Person implements Comparable<Person>{
    int idx;
    int priority;

    public Person(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }

    @Override
    public int compareTo( Person o) {
        return o.priority - this.priority;
    }
}