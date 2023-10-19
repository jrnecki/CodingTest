package section1_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10_가장짧은문자거리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        String str = st.nextToken();
        char t = st.nextToken().charAt(0);
        int [] arr = new int[str.length()];
        char [] c = str.toCharArray();
        int p =1000;
       for(int i=0; i<arr.length; i++){
           if(c[i] == t){
               p=0;
           }else{
               p++;
           }
           arr[i] = p;
        }
       p =1000;
        for(int i=arr.length-1;i>=0; i--){
            if(c[i] == t){
                p=0;
            }else{
                p++;
            }
            arr[i] = Math.min(p,arr[i]);
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
