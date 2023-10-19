package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q8_이분검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(binary_sort(M,arr.length,arr)+1);
    }
    public static int binary_sort(int key, int n,int[] arr){
        int low = 0;
        int high = n-1;
        int mid ;
        while(low<=high){
            mid = (low+high)/2;
            if(key>arr[mid]){
                low = mid+1;
            }else if(key <arr[mid]){
                high = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
