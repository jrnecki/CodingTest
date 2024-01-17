package programmers.level_1;

import java.util.Stack;

class 크레인인형뽑기게임 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int m : moves){
            m = m-1;
            int i = 0;
            while(i<board.length-1 && board[i][m] == 0 ){
                i++;
            }
            int target = board[i][m];
            board[i][m] = 0;
            if(target == 0 ){
                continue;
            }else{
                if(stack.isEmpty()){
                    stack.push(target);
                }else{
                    if(stack.peek() == target){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(target);
                    }
                }
            }
        }
        return answer;
    }
}
