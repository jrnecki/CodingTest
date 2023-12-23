package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5_다익스트라 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점
        int m = Integer.parseInt(st.nextToken()); // 간선
        int [] dis = new int[n+1];
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for(int i =0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        // 거리비용 배열 초기화
        Arrays.fill(dis, Integer.MAX_VALUE);
        // 그래프 세팅
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(v).add(new Edge(e,c));
        }

        // 다익스트라
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(1,0));
        dis[1] = 0;
        while(!pq.isEmpty()){
            Edge tmp = pq.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(nowCost > dis[now]) continue;
            for(Edge ob :graph.get(now)){// 해당 정점에서 갈 수 있는 정점들
                if(dis[ob.vex] > nowCost+ob.cost){
                    dis[ob.vex] = nowCost+ob.cost;
                    pq.offer(new Edge(ob.vex, nowCost+ob.cost));
                }
            }
        }
    }
}
 class Edge implements Comparable<Edge>{
     public int vex;
     public int cost;
     Edge(int vex, int cost) {
         this.vex = vex;
         this.cost = cost;
     }
     @Override
     public int compareTo(Edge ob){
         return this.cost-ob.cost;
     }
}
