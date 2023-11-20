package section4_Hashmap_Treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q4_모든아나그램찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split("");
        String [] arr2 = br.readLine().split("");

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        for(int i=0; i<arr2.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            map2.put(arr2[i],map2.getOrDefault(arr2[i],0)+1);
        }
        int answer =0;
        if(map.equals(map2)){
            answer++;
        }
        for(int i=arr2.length; i<arr.length; i++){
            String key1 = arr[i- arr2.length];
            map.put(key1, map.getOrDefault(key1,0)-1);
            if(map.get(key1)==0){
                map.remove(key1);
            }
            String key2 = arr[i];
            map.put(key2, map.getOrDefault(key2,0)+1);
            if(map.equals(map2)){
                answer++;
            }
        }
        System.out.println(answer);

    }
}
