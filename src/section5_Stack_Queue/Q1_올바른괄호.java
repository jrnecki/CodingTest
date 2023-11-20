package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1_올바른괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char arr[] = str.toCharArray();
        Stack <Character> stack = new Stack<>();
        for(char c : arr){
            if(stack.isEmpty()){
                stack.push(c);
            }else{
                if(stack.peek() =='(' && c==')'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
