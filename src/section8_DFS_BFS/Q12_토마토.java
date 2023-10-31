package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q12_토마토 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n= Integer.parseInt(st.nextToken());

        int board[][] = new int[n][m];
        int dis[][] = new int[n][m];
        Queue<Point> queue = new LinkedList<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1){
                    queue.offer(new Point(i,j));
                }
            }
        }
        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};
        while(!queue.isEmpty()){
            Point p = queue.poll();
            for(int i=0; i<4; i++){
                int nx = p.x+dx[i];
                int ny = p.y+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[p.x][p.y]+1;
                }

            }
        }
        boolean flag = true;
        // 익지 않은 토마토 있나 확인
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j] == 0){
                    flag = false;
                }
            }
        }
        int answer = Integer.MIN_VALUE;
        if(flag){
            for(int i=0; i<n; i++){
                for(int j =0; j<m; j++){
                    answer = Math.max(answer,dis[i][j]);
                }
            }
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }

    }
    public static class Point{
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int x;
        int y;
    }
}
