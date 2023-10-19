package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2_대소문자변환 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }
            // 아스키 코드로 해보기
            // 대문자 65 ~ 90
            // 소문자 97 ~ 122
            // 대소문자의 차이 32
//             if(c >=97 && c<=122){
//                 c = (char)(c-32);
//             }else{
//                 c = (char)(c+32);
//             }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
