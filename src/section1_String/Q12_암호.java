package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12_암호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringBuilder answer = new StringBuilder();
        int i=0;
        for(int j=0; j<n; j++){
            String signal = str.substring(i,i+7);
            // replaceAll 사용
            //String signal = str.substring(0,7).replace('#','1').replace('*','0');
            StringBuilder sb = new StringBuilder();
            for(char c : signal.toCharArray()){
                sb = c=='#'?sb.append(1):sb.append(0);
            }

            int decimal = Integer.parseInt(sb.toString(),2);
            answer.append((char)decimal);
            i = i+7;
        }
        System.out.println(answer.toString());
    }
}
