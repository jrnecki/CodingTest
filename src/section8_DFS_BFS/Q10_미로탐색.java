package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10_미로탐색 {
    // 방향 세팅
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static int[][] board;
    static int answer=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        board = new int  [8][8];
        for(int i=1; i<=7;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=7; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
            board[1][1] = 1;
            dfs(1,1);
        }
    }
    public static  void dfs(int x, int y){
        if(x==7 && y==7){
            answer++;
        }else{
            for(int i=0; i<4; i++){
                int nx = x +dx[i];
                int ny = y+dy[i];
                if(nx >=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny] == 0){
                    board[nx][ny] = 1;
                    dfs(nx,ny);
                    // 탐색이 끝났으면
                    // 백하기 위해 풀어준다.
                    board[nx][ny] = 0;
                }
            }
        }
    }
}
