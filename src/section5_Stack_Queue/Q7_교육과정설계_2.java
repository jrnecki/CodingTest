package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q7_교육과정설계_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] order = br.readLine().toCharArray();
        char [] arr = br.readLine().toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for(char c : order){
            queue.offer(c);
        }
        String answer = "YES";
        for(char c : arr){
            if(queue.contains(c)){
                if(queue.peek() == c){
                    queue.poll();
                    if(queue.isEmpty()) break;
                }else{
                    answer = "NO";
                    break;
                }
            }
        }
        if(!queue.isEmpty()){
            answer = "NO";
        }
        System.out.println(answer);
    }
}
