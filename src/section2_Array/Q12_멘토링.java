package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q12_멘토링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [][] students = new int[m][n];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++){
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer =0;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                int cnt = 0;
                for(int k =0; k<m; k++){
                    int pi= 0;
                    int pj = 0;
                    for(int s=0; s<n; s++){
                        if(students[k][s]==i) pi=s;
                        if(students[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt == m){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
