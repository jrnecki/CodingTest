package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q5_동전교환 {
    static int n,m;
    static Integer [] arr;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최소 동전개수를 사용하기 위해
        // 큰수부터 따져보도록 배열을 내림차순 정렬한다.
        Arrays.sort(arr,Collections.reverseOrder());
        m = Integer.parseInt(br.readLine());
       dfs(0,0);
        System.out.println(min);
    }
    public static void dfs(int l, int sum){
        if(sum >m) return;
        if(l>=min) return; // 굳이 더 깊게 들어가지 않아도 된다.
        if( sum == m){
            min = Math.min(min,l);
        }
        else{
            for(int i=0; i<n; i++){
                dfs(l+1,sum+arr[i]);
            }
        }
    }
}
