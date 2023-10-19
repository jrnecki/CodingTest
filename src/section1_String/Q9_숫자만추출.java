package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9_숫자만추출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String answer="" ;
        for(char c: str.toCharArray()){
            if(Character.isDigit(c)){
                answer+=c;
            }
        }
        System.out.println(Integer.parseInt(answer));
    }
}

