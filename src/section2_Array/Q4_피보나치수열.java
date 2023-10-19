package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_피보나치수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] numbers = new int[n+1];
        numbers[1] =1;
        numbers[2] = 1;
        for(int i=3; i<=n; i++){
            numbers[i] = numbers[i-1]+numbers[i-2];

        }
        for(int i=1; i<=n; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
