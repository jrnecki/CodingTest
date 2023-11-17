package section3_Twopointers_Slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5_연속된자연수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int [] arr = new int[n+1];
        int m = n/2 + 1;
        for(int i=0; i<m; i++){
            arr[i] = i+1;
        }
        int lt =0;
        int sum =0;
        int answer = 0;

        for(int rt = 0; rt<m; rt++){
            sum+=arr[rt];
            if(sum == n){
                answer++;
            }
            while(sum>=n){
                sum-=arr[lt++];
                if(sum == n){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
