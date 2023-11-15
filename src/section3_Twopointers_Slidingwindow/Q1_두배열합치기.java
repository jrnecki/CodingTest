package section3_Twopointers_Slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_두배열합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int arr2 [] = new int[m];
        for(int i=0; i<m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int p1=0; int p2=0;
        while(p1 <arr.length && p2<arr2.length){
            if(arr[p1]<arr2[p2]){
                System.out.print(arr[p1++]+" ");
            }else {
                System.out.print(arr2[p2++] + " ");
            }
        }

        while(p1 <arr.length){
            System.out.print(arr[p1++]+" ");
        }
        while(p2 <arr2.length){
            System.out.print(arr2[p2++]+" ");
        }

    }
}
