package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5_특정문자뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char [] arr = s.toCharArray();
        int lt = 0;
        int rt = arr.length-1;

        while(rt > lt){
            if(!Character.isAlphabetic(arr[lt])){
               lt++;
            }else if(!Character.isAlphabetic(arr[rt])){
                rt--;
            }else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
