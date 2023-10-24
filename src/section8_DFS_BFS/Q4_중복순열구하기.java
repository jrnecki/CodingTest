package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_중복순열구하기 {
    static int n,m;
    static  int [] arr,pm;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
        System.out.println(n+" "+m);
        arr = new int[n];
        pm = new int[m];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        dfs(0);

    }
    public static void dfs(int l){
        if(l == m){
            for(int x : pm){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=1; i<=n; i++){
                pm[l] = i;
                dfs(l+1); // n번 호출 일어남.
            }
        }
    }
}
