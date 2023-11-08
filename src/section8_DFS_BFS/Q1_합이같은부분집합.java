package section8_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_합이같은부분집합 {
    static String answer="NO";
    static int n, total=0;
    static boolean flag=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] numbers = new int[n];
        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
            total+=numbers[i];
        }
        DFS(0,0,numbers);
        System.out.println(answer);

    }
    public static void DFS(int L, int sum, int[] arr){
        if(flag) return;
        if(sum>total/2) return;
        if(L==n){
            if((total-sum)==sum){ // total/2 로 하면 홀수일 경우 답이 다르다.
                answer="YES";
                flag=true;
            }
        }
        else{
            DFS(L+1, sum+arr[L], arr);
            DFS(L+1, sum, arr);
        }
    }
}
