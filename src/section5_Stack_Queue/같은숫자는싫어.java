package section5_Stack_Queue;

import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {1,1,3,3,0,1,1};
        for(int i: arr){

            if(stack.isEmpty()){
                stack.push(i);
                System.out.println(i);
            }else{
                if(stack.peek() == i){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }

        }

        int [] answer = new int[stack.size()];
        for(int i : stack){
            System.out.print(i+" ");

        }
    }
}
