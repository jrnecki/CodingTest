package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q7_원더랜드_크루스칼 {
    static  int [] roads;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        roads = new int[v+1];
        for(int i=1; i<=v; i++){
            roads[i] = i;
        }

        ArrayList<Road> list = new ArrayList<>();
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.add(new Road(v1,v2,cost));
        }
        Collections.sort(list);
        int sum =0;
        // 크루스칼
        for(Road r: list){
            int v1 = r.v1;
            int v2 = r.v2;
            int cost = r.cost;
            if(findUnion(v1)!= findUnion(v2)){
                unionRoads(v1,v2);
                sum+=cost;
            }
        }
        System.out.println(sum);
    }
    private static void unionRoads(int v1, int v2) {
        int ra = findUnion(v1);
        int rb = findUnion(v2);
        if(ra != rb){
            roads[ra] = rb;
        }
    }

    private static int findUnion(int v) {
        if(roads[v] ==v ){
            return v;
        }else{
            return roads[v]= findUnion(roads[v]);
        }
    }
}
class Road implements Comparable<Road>{
    public int v1,v2,cost;
    Road(int v1,int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Road ob){
        return this.cost-ob.cost;
    }
}
