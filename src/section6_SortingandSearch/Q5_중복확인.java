package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q5_중복확인 {
    public static void main(String[] args) throws IOException {
        // 정렬 후
        // 비교한 뒤 값이 같으면 중복
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                answer="D";
                break;
            }
        }
        System.out.println(answer);
    }
}
