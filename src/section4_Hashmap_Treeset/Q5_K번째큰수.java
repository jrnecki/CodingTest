package section4_Hashmap_Treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5_K번째큰수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    set.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        if(set.size()<K){
            System.out.println(-1);
        }else{
            int idx = 1;
            for(int i : set){
                if(idx == K){
                    System.out.println(i);
                }
                idx++;
            }
        }

    }
}
