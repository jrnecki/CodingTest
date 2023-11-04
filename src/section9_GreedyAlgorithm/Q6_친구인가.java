package section9_GreedyAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_친구인가{
    static int [] students;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        students = new int[n+1];
        for(int i=1; i<=n; i++){
            students[i] = i;
        }
        for(int i =0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            unionFriends(a,b);
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int fa=findUnion(a);
        int fb=findUnion(b);
        if(fa==fb) System.out.println("YES");
        else System.out.println("NO");
    }
    private static void unionFriends(int a, int b) {
        int fa = findUnion(a);
        int fb = findUnion(b);
        if(fa != fb){
            students[fa] = fb;
        }
    }

    private static int findUnion(int v) {
        if(students[v] == v){
            return v;
        }else{
            return students[v] = findUnion(students[v]);
        }
    }
}
