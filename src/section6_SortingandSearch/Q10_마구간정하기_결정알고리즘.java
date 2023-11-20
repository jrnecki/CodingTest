package section6_SortingandSearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10_마구간정하기_결정알고리즘 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int [] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        int answer = 0;

        while(lt <= rt){
            int mid = (lt+rt)/2;
            int horseCnt = getHoresCount(mid,arr);
            if(horseCnt >=c){
                answer = mid;
                lt = mid+1;
            }else{
                rt = mid-1;
            }
        }
        System.out.println(answer);
    }

    private static int  getHoresCount(int mid, int[] arr) {
        int cnt=1;
        int ep = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-ep >= mid){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
