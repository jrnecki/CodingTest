package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q2_버블정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bubble_sort(arr,arr.length);
    }
    public static void bubble_sort(int arr[],int n){
        // round 횟수
        for(int i=1; i<n; i++){
            for(int j =0; j<n-i; j++ ){
                if(arr[j+1]<arr[j]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
