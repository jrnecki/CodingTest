package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2_회의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Meeting> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Meeting(s,e));
        }
        Collections.sort(list); // 종료시간 오름차순
        int finish = Integer.MIN_VALUE; // 이전 회의 끝난 시간
        int answer=0;
        for(Meeting m : list){
            if(finish<= m.start ){
                answer++;
                finish = m.end;
            }
        }
        System.out.println(answer);
    }
    public static class Meeting implements Comparable<Meeting>{
        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        int start;
        int end;

        @Override
        public int compareTo(Meeting o) {
            if(o.end == this.end){
                return this.start - o.start;
            }
            return this.end - o.end;
        }
    }
}
