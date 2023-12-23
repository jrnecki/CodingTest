package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q6_중복순열 {
    static int [] arr,pm,ch;
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         n = Integer.parseInt(st.nextToken());
         m  = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
         arr = new int[n];
         ch = new int[n];
         pm = new int[m];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        Set<Integer> list = new HashSet<>();


    }
    public static void dfs(int l){
        if(l == m){
            for(int i=0; i<m; i++){
                System.out.print(pm[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=0; i<arr.length; i++){
                if(ch[i] ==0){
                    ch[i] =1;
                    pm[l] = arr[i];
                    dfs(l+1);
                    ch[i] =0;
                }
            }
        }
    }
}
