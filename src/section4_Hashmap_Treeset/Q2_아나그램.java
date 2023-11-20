package section4_Hashmap_Treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q2_아나그램 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str1 = br.readLine().split("");
        String []str2 = br.readLine().split("");

        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str1){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s : str2){
            map.put(s,map.getOrDefault(s,0)-1);
        }
        String answer = "YES";
        for(String s: map.keySet()){
            if(map.get(s)!=0){
                answer="NO";
            }
        }
        System.out.println(answer);

    }
}
