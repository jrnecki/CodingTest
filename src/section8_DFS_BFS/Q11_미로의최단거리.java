package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11_미로의최단거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int board [][] = new int[8][8];
        int dis [][] = new int[8][8];

        for(int i=0; i<7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<7; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(1,1));
        board[1][1] = 1;

        while(!queue.isEmpty()){
            Point p= queue.poll();
            int x = p.x;
            int y = p.y;
            for(int i=0; i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx >=1 && nx <=7 && ny>=1&& ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1;
                    queue.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[p.x][p.y] +1;
                }
            }
        }

        if(dis[7][7]==0){
            System.out.println(-1);
        }else{
            System.out.println(dis[7][7]);
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
