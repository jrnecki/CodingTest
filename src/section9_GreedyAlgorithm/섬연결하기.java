package section9_GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 섬연결하기 {
    public static int cruscal[] ;
    public static void main(String[] args) {

    }
    public int solution(int n, int[][] costs) {
        int answer = 0;
        cruscal = new int[n];
        for(int i=0; i<n; i++){
            cruscal[i] = i;
        }


        ArrayList<Edge1> list = new ArrayList<>();
        for(int [] info : costs){
            int v1 = info[0];
            int v2 = info[1];
            int cost = info[2];
            list.add(new Edge1(v1, v2, cost));
        }
        Collections.sort(list);
        int sum = 0;

        // 크루스칼
        for(Edge1 e : list){
            int v1 = e.v1;
            int v2 = e.v2;
            int cost = e.cost;
            if(findUnion(v1) != findUnion(v2)){
                unionBridge(v1,v2);
                sum+=cost;
            }
        }
        return sum;
    }
    public void unionBridge(int v1, int v2) {
        int ra = findUnion(v1);
        int rb = findUnion(v2);
        if(ra != rb){
            cruscal[ra] = rb;
        }
    }

    public int findUnion(int v) {
        if(cruscal[v] ==v ){
            return v;
        }else{
            return cruscal[v]= findUnion(cruscal[v]);
        }
    }
}
class Edge1 implements Comparable<Edge1>{
    int v1;
    int v2;
    int cost;

    Edge1(int v1, int v2, int cost){
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge1 ob){
        return this.cost-ob.cost;
    }
}
