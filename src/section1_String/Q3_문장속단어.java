package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3_문장속단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] words = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int k=0;
        for(int i =0; i<words.length; i++){
            if(max < words[i].length()){
                max = words[i].length();
                k = i;
            }
        }
        System.out.println(words[k]);
    }
}
