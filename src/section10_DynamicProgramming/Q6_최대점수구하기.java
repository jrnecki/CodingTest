package section10_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_최대점수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int  time = Integer.parseInt(st.nextToken());
        int dp[] = new int[time+1];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int ps = Integer.parseInt(st.nextToken());
            int pt = Integer.parseInt(st.nextToken());
            for(int j =time; j>=pt;j--){
                dp[j] = Math.max(dp[j],dp[j-pt]+ps);
            }
        }
        System.out.println(dp[time]);
    }
}
