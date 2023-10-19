package section1_String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// BufferedReader
// read() vs readLine
public class Q4_단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i =0; i<n; i++){
            StringBuilder sb = new StringBuilder(br.readLine());
            arr[i] = sb.reverse().toString();
        }
        for(String s : arr){
            System.out.println(s);
        }
    }
}
