package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9_격자판최대합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // rows
        int max =0;
        for(int i=0; i<n; i++){
            int sum =0;
            for(int j =0; j<n; j++){
               sum+=board[i][j];
            }
            max = Math.max(max,sum);
        }

        // columns
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j =0; j<n; j++){
                sum+=board[j][i];
            }
            max = Math.max(max,sum);
        }

        // 대각선
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
               if(i==j){
                   sum +=board[i][j];
               }
            }
        }
        max = Math.max(max,sum);
        System.out.println(max);
    }
}
