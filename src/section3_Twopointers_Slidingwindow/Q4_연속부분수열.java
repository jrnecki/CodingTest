package section3_Twopointers_Slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4_연속부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr [] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int lt=0;
        int answer =0;
        int sum =0;
        for(int rt=0; rt<n;rt++){
            sum +=arr[rt];
            if(sum == m) answer++;
            while(sum >= m){
                sum-=arr[lt++];
                if(sum == m) answer++;
            }
        }
        System.out.println(answer);
    }
}
