package section3_Twopointers_Slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_연속된자연수의합_수학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int answer =0;
        int cnt = 1; // 연속된 자연수의 개수
        n--;
        while(n>0){
            cnt++;
            n = n-cnt;
            if(n%cnt==0) answer++;
        }
        System.out.println(answer);

    }
}
