package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2_바둑이승차 {
    static int c,n;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dfs(0,0);
        System.out.println(max);
    }
    public static void dfs(int l, int s){
        if(c <s) return;
        if(l == n) {
            max = Math.max(max,s);
        }
        else{
            dfs(l+1,s+arr[l]);
            dfs(l+1,s);
        }
    }
}
