package section5_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4_후위식연산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        Stack<Integer> stack = new Stack<>();
        int answer =0;
        for(char c : arr){
            if(c>='0' && c<='9'){
                stack.push(c-'0');
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                int result=0;
                if(c=='+'){
                    result = lt+rt;
                }else if(c=='-'){
                    result = lt - rt;
                }else if(c=='*'){
                    result = lt * rt;
                }else{
                    result = lt / rt;
                }
                stack.push(result);
            }
        }
        System.out.println(stack.get(0));
    }
}
