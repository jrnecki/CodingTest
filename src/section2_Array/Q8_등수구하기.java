package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q8_등수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[n];
        int answer[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j =0; j<n; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        for(int i=0; i<n; i++){
            System.out.print(answer[i]+" ");
        }

    }
}
