package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q8_송아지찾기 {
    static int answer = 0;
    static int[] dis = {1,-1,5};
    static int[] visited ;
    static Queue<Integer> queue = new LinkedList<>();
    public static int dfs(int s, int e){
        visited= new int[10001];
        visited[s] = 1;
        queue.offer(s);
        int L = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                int x = queue.poll();
                for(int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if(x==e) return L;
                    if(nx >=1 && nx<=10000 && visited[nx] == 0){
                        visited[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        System.out.println(dfs(s,e));
    }
}
