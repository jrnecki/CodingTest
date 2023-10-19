package section1_String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 대소문자 구분하지 않으므로
// 문자열과 문자 모두 소문자로 변환해준 뒤 따져준다.
public class Q1_문자찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toLowerCase();
        char  target = br.readLine().toLowerCase().charAt(0);
        // Character.toLowerCase(문자열)

        int answer = 0;
        for(char  c : s.toCharArray()){
            if(c == target){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
