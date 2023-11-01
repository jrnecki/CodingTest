package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q1_씨름선수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Player> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(new Player(h,w));
        }
        Collections.sort(list);
        int answer=0;
        int max = Integer.MIN_VALUE;
        for(Player p : list){
            if(max <p.wieght){
                answer++;
                max = p.wieght;
            }
        }
        System.out.println(answer);
    }

    public static class Player implements Comparable<Player> {
        public Player(int height, int wieght) {
            this.height = height;
            this.wieght = wieght;
        }
        @Override
        public int compareTo(Player p){
            return p.height - this.height;
        }

        int height;
        int wieght;

    }
}
