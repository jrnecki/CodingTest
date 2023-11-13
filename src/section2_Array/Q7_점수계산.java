package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7_점수계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =  Integer.parseInt(st.nextToken());
        }
        int sum =0;
        int k =1;
        for(int res : arr){
            if(res ==1){
                sum+=k;
                k++;
            }else{
                k = 1;
            }
        }
        System.out.println(sum);
    }
}
