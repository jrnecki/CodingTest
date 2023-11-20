package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q5_쇠막대기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            char c = arr[i];
            if(c=='('){ // 여는 괄호라면
                stack.push(c);
            }else{ // 닫는 괄호라면
                if(arr[i-1]=='('){ // 레이저일때
                    stack.pop();
                    answer+=stack.size();
                }else{ // 막대의 닫는 괄호일때
                    stack.pop();
                    answer+=1;
                }
            }
        }
        System.out.println(answer);
    }
}
