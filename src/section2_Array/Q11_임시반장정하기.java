package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q11_임시반장정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] students = new int[n+1][6];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=5; j++){
                students[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = Integer.MIN_VALUE;
        int answer = 0;

        for(int i=1; i<=n; i++){
           int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(students[i][k] == students[j][k] ){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
