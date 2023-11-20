package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q9_뮤직비디오_결정알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        st = new StringTokenizer(br.readLine());
       for(int i=0; i<n; i++){
           arr[i] = Integer.parseInt(st.nextToken());
       }
        int lt = Arrays.stream(arr).max().getAsInt();
       int rt = Arrays.stream(arr).sum();
       int answer = 0;
       while(lt <= rt){
           int mid = (lt+rt)/2;
           if(count(arr,mid) <=m){
               answer = mid;
               rt = mid-1;
           }else{
               lt = mid+1;
           }
       }
        System.out.println(answer);
    }

    private static int count(int[] arr, int mid) {
        int cnt = 1;
        int sum = 0;
        for(int x : arr){
            if(sum+x > mid){
                cnt++;
                sum = x;
            }else{
                sum+=x;
            }
        }
        return cnt;
    }
}
