package section1_String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BufferedReader
// read() vs readLine
public class Q4_단어뒤집기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for(int i =0; i<n; i++){
            char[] s = br.readLine().toCharArray();
            int  lt = 0, rt = s.length-1;
            while(lt <rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            arr[i] =String.valueOf(s);
        }
        for(String s : arr){
            System.out.println(s);
        }
    }
}
