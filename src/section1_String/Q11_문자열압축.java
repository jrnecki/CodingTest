package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11_문자열압축 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
       char [] arr = str.toCharArray();
        int cnt = 1;
        char prev = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<arr.length; i++){
            if(prev == arr[i]){
                cnt++;
            }else{
                sb.append(prev);
                if(cnt >=2){
                    sb.append(cnt);
                }
                prev = arr[i];
                cnt = 1;
            }
        }
        if(cnt==1){
          sb.append(prev);
        }else{
            sb.append(prev).append(cnt);
        }
        System.out.println(sb.toString());
    }
}
