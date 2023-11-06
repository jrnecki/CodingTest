package section10_DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q4_가장높은탑쌓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Brick> list = new ArrayList<>();
        int dp[] = new int[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            list.add(new Brick(width,height,weight));
        }

        Collections.sort(list);
        dp[0] = list.get(0).height;
        int answer = dp[0];

        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(list.get(j).weight>list.get(i).weight  && dp[j]>max){
                    max = dp[j];
                }
                dp[i] = max+ list.get(i).height;
                answer = Math.max(answer,dp[i]);
            }
        }
        System.out.println(answer);
    }
    public static class Brick implements Comparable<Brick>{
        public Brick(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        int width,height,weight;

        @Override
        public int compareTo(Brick o) {
            return o.width - this.width;
        }
    }
}
