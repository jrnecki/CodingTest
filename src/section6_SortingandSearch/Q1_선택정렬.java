package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1_선택정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // 선택정렬
        int minIndx =0,tmp;
        for(int i=0; i<arr.length-1; i++){
            minIndx = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[minIndx]>arr[j]){
                    minIndx = j;
                }
            }
            tmp=arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = tmp;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
