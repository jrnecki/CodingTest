package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_부분집합구하기 {
    public static int[] arr ;
    public static  int[] combi;
    public static int n;
    public static  int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr= new int[n];
        combi = new int[m];
        
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        dfs(0,1);
    }

    private static void dfs(int L, int S) {
        if(L == m){
            for(int x : combi){
                System.out.print(x+" ");
            }
            System.out.println();
        }else{
            for(int i=S; i<=n; i++){
                combi[L] = i;
                dfs(L+1,i+1);
            }
        }
    }

}
