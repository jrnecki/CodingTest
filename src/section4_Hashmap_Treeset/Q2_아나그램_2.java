package section4_Hashmap_Treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q2_아나그램_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str1 = br.readLine().split("");
        String []str2 = br.readLine().split("");
        String answer = "YES";
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : str2){
            if(!map.containsKey(s) || map.get(s)==0){
                answer = "NO";
                break;
            }
            map.put(s,map.getOrDefault(s,0)-1);
        }
        System.out.println(answer);

    }
}
