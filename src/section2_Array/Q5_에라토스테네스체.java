package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_에라토스테네스체 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean []isPrime = new boolean[n+1];
        // 에라토스테네스 체
        // 소수가 되는 수의 배수를 지우면 남은 건 소수
        // 2 의 배수 제거 후 오른쪽에 2
        // 3의 배수 제거 후 오른쪽에 3
        // ...
        for(int i=1; i<isPrime.length; i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        int answer =0;
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                answer++;
                for(int j = i; j<=n; j=j+i){ // i의 배수 모두 없애기
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(answer);
    }
}
