package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q7_원더랜드_프림{
    static  int [] roads;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<City>> list = new ArrayList<>();
        for(int i=0; i<=v; i++){
            list.add(new ArrayList<City>());
        }
        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int number1 = Integer.parseInt(st.nextToken());
            int number2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list.get(number1).add(new City(number2,cost));
            list.get(number2).add(new City(number1,cost));
        }

        int sum =0;
        PriorityQueue<City> pq = new PriorityQueue<>();
        int[] check = new int[v+1];
        pq.offer(new City(1,0));
        while(!pq.isEmpty()){
            City tmp = pq.poll();
           int cityyVex = tmp.number;
           if(check[cityyVex] == 0){
               check[cityyVex] =1;
                 sum+=tmp.cost;
               for(City ob : list.get(cityyVex)){
                   if(check[ob.number] ==0) pq.offer(new City(ob.number, ob.cost));
               }

            }

        }
        System.out.println(sum);
    }

    private static class City implements Comparable<City>{
        public City(int number, int cost) {
            this.number = number;
            this.cost = cost;
        }

        int number,cost;

        @Override
        public int compareTo(City o) {
            return this.cost - o.cost;
        }
    }
}
