package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q3_크레인인형뽑기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] board = new int [n][n];
        StringTokenizer st;
        for(int i=0; i< n; i++){
             st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        int [] moves = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m; i++){
            moves[i] =Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i :moves){
            for(int j=0; j<n; j++){
                int tmp = board[j][i-1];
                if(tmp != 0){
                    board[j][i-1] = 0;
                    if(stack.isEmpty()){
                        stack.push(tmp);
                    }else{
                        if(stack.peek() == tmp){
                            stack.pop();
                            answer+=2;
                        }else{
                            stack.push(tmp);
                        }
                    }
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
