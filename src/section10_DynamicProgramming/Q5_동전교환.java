package section10_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5_동전교환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] coins = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            coins[i] =Integer.parseInt(st.nextToken());
        }
        int value = Integer.parseInt(br.readLine());
        int dp[] = new int[value+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<N;i++){
            for(int j =coins[i]; j<=value;j++){
                dp[j] = Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        System.out.println(dp[value]);
    }
}
