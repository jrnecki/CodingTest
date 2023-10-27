package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7_조합의경우수_메모이제이션 {
   public static int[][] memo = new int[35][35];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.println( dfs(n,r));
    }
    public static int  dfs(int n, int r){
        if(memo[n][r]>0) return memo[n][r];
        if(n == r || r== 0){
            return memo[n][r]=1;
        }else{
            return memo[n][r] = dfs(n-1,r-1)+dfs(n-1,r);
        }
    }
}
