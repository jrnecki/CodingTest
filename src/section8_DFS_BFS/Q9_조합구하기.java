package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9_조합구하기 {
    public static int[] combi;
    public static  int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        combi = new int[m];
        dfs(0,1); // l: level, s: start
    }
    public static void dfs(int L, int s){
        if(L==m){
            for(int x : combi){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=s; i<=n; i++){
                combi[L] = i;
                dfs(L+1,i+1);
            }

        }
    }
}
