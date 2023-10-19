package section2_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3_가위바위보 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] plays = new int[2][n];

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                plays[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        String winner = "";
        for(int j = 0; j<n; j++){
            int a = plays[0][j];
            int b = plays[1][j];

            if(Math.abs(a-b)==1){
                if(a>b){
                    winner="A";
                }else{
                    winner="B";
                }
            }else if(Math.abs(a-b)==2){
                if(a<b){
                    winner="A";
                }else{
                    winner="B";
                }
            }else{
                winner="D";
            }
            System.out.println(winner);
        }
    }
}
