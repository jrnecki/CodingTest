package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q7_교육과정설계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] order = br.readLine().toCharArray();
        char [] arr = br.readLine().toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for(char c : arr){
            queue.offer(c);
        }
        int i=0;
        int cnt = 0;
        while(!queue.isEmpty()){
            int p = queue.poll();
            if(i==order.length) break;
            if(p == order[i]){
                i++;
                cnt++;
            }
        }
        if(cnt== order.length){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
