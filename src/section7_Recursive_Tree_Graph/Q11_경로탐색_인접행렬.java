package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11_경로탐색_인접행렬 {
    static int [][] graph;
    static int [] visited;
    static int n,m,answer;
    public static void dfs(int v){
        if(v == n){
            answer++;
        }else{
            for(int i=1; i<=n; i++){
                if(graph[v][i] == 1&& visited[i]==0){
                    visited[i] = 1;
                    dfs(i);
                    visited[i] = 0;
                }
            }
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n =Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph=new int[n+1][n+1];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }
        visited[1] =1;
        dfs(1);
        System.out.println(answer);
    }
}
