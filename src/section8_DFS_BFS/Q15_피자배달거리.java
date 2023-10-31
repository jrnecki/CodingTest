package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q15_피자배달거리 {
    public static int[] combi;
    public static ArrayList<Point> pz,hs;
    public static int n,m,answer = Integer.MAX_VALUE,len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
         pz = new ArrayList<>();
         hs = new ArrayList<>();

        int board[][] = new int[n][n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                int val = Integer.parseInt(st.nextToken());
                if(val == 1) hs.add(new Point(i,j));
                else if(val == 2) pz.add(new Point(i,j));
            }
        }
        len = pz.size();
        combi = new int[m];
        dfs(0,0);
        System.out.println(answer);

    }
    public static void dfs(int l, int s){
        if(l == m){ // 조합 완성
            int sum = 0;
            for(Point h : hs){
                int dis = Integer.MAX_VALUE;
                for(int i: combi){
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
                }
                sum+=dis;
            }
            answer = Math.min(answer,sum);
        }else{
            for(int i=s; i<len; i++){
                combi[l] = i;
                dfs(l+1,i+1);
            }
        }
    }
    public static class Point{
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        int  x,y;
    }
}
