package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_LeastRecentlyUsed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int [] caches = new int[S];

        for(int x : arr){
            int idx = -1;
            for(int i =0; i<S; i++){
                if(caches[i] == x){
                    idx = i;
                }
            }
            if(idx == -1){ // 캐시 미스
                for(int i=S-1; i>=1; i--){
                    caches[i] = caches[i-1];
                }
            }else{ // 캐시 히트
                for(int i= idx; i>=1; i--){
                    caches[i] = caches[i-1];
                }
            }
            caches[0] = x;
        }
        for(int c: caches){
            System.out.print(c+" ");
        }
    }
}
