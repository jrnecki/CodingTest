package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q4_최대수입스케줄 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Lecture> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.add(new Lecture(m,d));
        }
        Collections.sort(list);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int curDay = list.get(0).day;
        int sum = 0;

        int j =0; // j는 리스트의 인덱스

        // 최대날짜부터 하루씩 작아진다.
        for(int i=curDay; i>=1; i--){ // i는 날짜
            for( ; j<n; j++){ // 브레이크 걸리고 와도 j가 바깥에 있기 때문에 다음 인덱스부터 비교
                if(list.get(j).day <i) break;
                pq.offer(list.get(j).money);
            }
            if(!pq.isEmpty()) sum+=pq.poll(); // 해당 날짜에서 가장 큰 강의료
        }
        System.out.println(sum);
    }
    public static  class Lecture implements  Comparable<Lecture>{
        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        int money;
        int day;

        @Override
        public int compareTo(Lecture o) {
            return o.day - this.day;
        }
    }
}
