package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_회문문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int lt =0;
        int rt = str.length()-1;
        char [] arr = str.toCharArray();
        String answer = "YES";
        while(lt < rt){
            if(arr[lt] != arr[rt]){
                answer = "NO";
                break;
            }else{
                lt++;
                rt--;
            }
        }
        System.out.println(answer);
    }
}
