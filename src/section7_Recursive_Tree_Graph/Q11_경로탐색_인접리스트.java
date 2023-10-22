package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11_경로탐색_인접리스트 {
    static ArrayList<ArrayList<Integer>> graph;
    static int [] visited;
    static int n,m,answer;
    public static void dfs(int v){
        if(v == n){
            answer++;
        }else{
            for(int nv : graph.get(v)){
                if(visited[nv]==0){
                    visited[nv] = 1;
                    dfs(nv);
                    visited[nv] = 0;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n =Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        // 정점 넣을 객체 생성
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b); // a번 리스트에 접근후 b를 추가
        }
        visited[1] =1;
        dfs(1);
        System.out.println(answer);
    }

    }
}
