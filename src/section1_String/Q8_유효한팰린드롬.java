package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8_유효한팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "NO";
        String str = br.readLine()
                .toUpperCase()
                .replaceAll("[^A-Z]","");
       StringBuilder sb = new StringBuilder(str).reverse();
       if(str.equals(sb.toString())){
           answer = "YES";
       }
        System.out.println(answer);
    }
}
