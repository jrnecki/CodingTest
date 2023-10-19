package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q7_좌표정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Point> list = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            list.add(new Point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Collections.sort(list);
        for(Point p : list){
            System.out.println(p.x+" "+p.y);
        }

    }
    static class Point implements Comparable<Point>{
        int x;
        int y;
        Point(int x, int y){
            this.x =x;
            this.y =y;
        }

        @Override
        public int compareTo(Point o) {
            if(this.x == o.x) return this.y-o.y;
            else return this.x-o.x;
        }
    }
}
