package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q12_그래프최단거리 {
    static int n,m,answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int [] visited, dis;
    public void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(int nx : graph.get(x)){
                if(visited[nx]==0){
                    visited[nx] = 1;
                    queue.offer(visited[nx]);
                    dis[nx] = dis[x]+1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(br.readLine());
         m = Integer.parseInt(br.readLine());

         graph = new ArrayList<>();
         for(int i=0; i<=n; i++){
             graph.add(new ArrayList<>());
         }
         visited = new int[n+1];
         dis = new int[n+1];

         for(int i=0; i<=n; i++){
             StringTokenizer st = new StringTokenizer(br.readLine());
             int a = Integer.parseInt(st.nextToken());
             int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
         }
         bfs(1);
         for(int i=2; i<=n; i++){
             System.out.println(i+" : "+dis[i]);
         }
    }
}
