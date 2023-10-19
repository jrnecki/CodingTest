package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_회문문자열_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        String answer = "YES";
        StringBuilder sb = new StringBuilder(str).reverse();
        if(!str.equals(sb.toString())){
            answer = "NO";
        }
        System.out.println(answer);
    }
}
