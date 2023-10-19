package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2_보이는학생 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        int answer=0;
        for(int i=0; i<n; i++){
            int now = Integer.parseInt(st.nextToken());
            if(max < now){
                answer++;
            }
            max =Math.max(max,now);
        }
        System.out.println(answer);
    }
}
