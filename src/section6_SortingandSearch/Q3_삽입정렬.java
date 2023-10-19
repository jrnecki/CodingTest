package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3_삽입정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bubble_sort(arr,arr.length);
    }
    public static void bubble_sort(int[] arr, int n){
        for(int i=1; i<n; i++){
            int target = arr[i];
            int j = i-1;
            while(j>=0 && target<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = target;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
