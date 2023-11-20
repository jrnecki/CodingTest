package section4_Hashmap_Treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q3_매출액의종류 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String arr [] = br.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<k; i++){
            String key = arr[i];
            map.put(key, map.getOrDefault(key,0)+1);
        }
        System.out.print(map.size()+" ");
        for(int i=k; i<n; i++){
            String key1 = arr[i-k];
            map.put(key1, map.getOrDefault(key1,0)-1);
            if(map.get(key1)==0){
                map.remove(key1);
            }
            String key2 = arr[i];
            map.put(key2, map.getOrDefault(key2,0)+1);
            System.out.print(map.size()+" ");
        }

    }
}
