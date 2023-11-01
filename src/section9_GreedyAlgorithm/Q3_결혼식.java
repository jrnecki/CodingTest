package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q3_결혼식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            list.add(new Time('s', s));
            int e = Integer.parseInt(st.nextToken());
            list.add(new Time('e', e));
        }
        int cnt=0;
        int max = Integer.MIN_VALUE;

        Collections.sort(list);
        for(Time t : list){
            if(t.status=='s'){
                cnt++;
                if(max < cnt){
                    max = cnt;
                }
            }else{
                cnt--;
            }
        }
        System.out.println(max);
    }

    public static class Time implements Comparable<Time> {
        public Time(char status, int time) {
            this.status = status;
            this.time = time;
        }

        char status;
        int time;

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) {
                return this.status - o.status;
            } else {
                return this.time - o.time;
            }
        }
    }
}