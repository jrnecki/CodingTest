package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13_섬나라아일랜드 {
    public static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    public static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int board[][] = new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
               if(board[i][j] ==1){
                   answer++;
                   board[i][j] = 0;
                   dfs(i,j,board);
               }
            }
        }
        System.out.println(answer);
    }
    public static void dfs(int x, int y, int[] []board){
        for(int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<board.length && ny>=0 && ny<board.length &&
            board[nx][ny] ==1){
                board[nx][ny] = 0;
                dfs(nx,ny,board);
            }
        }
    }
}
