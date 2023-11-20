package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q2_괄호문자제거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char [] arr = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c : arr){
            if(stack.isEmpty()){
                stack.push(c);
            }else if(c ==')'){
                while(stack.peek()!='('){
                    stack.pop();
                }
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb.reverse());
    }
}
