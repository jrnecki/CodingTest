package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// indexOf
// substring
// 을 이용하여 푸는 방법.
public class Q3_문장속단어_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String str = br.readLine();
        String answer = "";
       int max = Integer.MIN_VALUE,pos;

       while((pos= str.indexOf(' '))!= -1){
           String tmp = str.substring(0,pos); // 빈칸 인덱스가 pos
           int l = tmp.length();
           if(l > max){
               max = l;
               answer = tmp;
           }
           // 현재의 빈칸 인덱스 이후로 잘라주어야함.
           str = str.substring(pos+1);
        }
       // 마지막 단어는 끝에 빈칸이 없으므로 while문에 들어가지 못한다.
        // 따라서 여기서 처리해주어야함.
        if(str.length() > max){
            answer = str;
        }
        System.out.println(answer);
    }
}
