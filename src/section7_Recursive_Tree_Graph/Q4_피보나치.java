package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4_피보나치 {
    static int[] numbers;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        numbers = new int[n+1];
        for(int i=1; i<=n; i++){
            System.out.print(fibo(i)+" ");
        }

    }
    public static int fibo(int n ){
        if(n==1 || n==2){
            return numbers[n]=1;
        }else{
            return numbers[n] = fibo(n-2)+fibo(n-1);
        }
    }
}
