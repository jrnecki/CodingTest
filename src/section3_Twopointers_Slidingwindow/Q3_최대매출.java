package section3_Twopointers_Slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3_최대매출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
         st = new StringTokenizer(br.readLine());
         int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int max = 0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        max = sum;
        for(int i=k; i<n-k; i++){
            sum+=(arr[i] - arr[i-k]);
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
