package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10_봉우리 {
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
        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                int val = board[i][j];
                int max = -1;
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i+ dx[k];
                    int ny = j +dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]>=board[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }
}
