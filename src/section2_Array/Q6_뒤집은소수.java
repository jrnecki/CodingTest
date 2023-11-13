package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_뒤집은소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res =  res * 10 +t;
                tmp = tmp/10;
            }
            if(isPrime(res)){
                System.out.print(res+" ");
            }
        }
    }

    private static boolean  isPrime(int tmp) {
        if(tmp ==1) return false;
        for(int i=2; i<tmp/2; i++){
            if(tmp%i ==0){
                return false;
            }
        }
        return true;
    }
}
