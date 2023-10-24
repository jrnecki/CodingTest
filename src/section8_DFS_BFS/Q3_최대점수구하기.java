package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q3_최대점수구하기 {
    static ArrayList<Quiz> list;
    static int max = Integer.MIN_VALUE;
    static int n,totalTime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        totalTime = Integer.parseInt(st.nextToken());
        list = new ArrayList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            list.add(new Quiz(s,t));
        }
        dfs(0,0,0);
        System.out.println(max);
    }
    public static class Quiz{
        int score;
        int time;
        Quiz(int score, int time){
            this.score = score;
            this.time = time;
        }
    }
    public static  void dfs(int l, int sum, int time){
        if(time>totalTime) return;
        if(l == list.size()) {
            max = Math.max(max,sum);
        }else{
            dfs(l+1,sum+list.get(l).score,time+list.get(l).time);
            dfs(l+1,sum,time);
        }
    }
}
