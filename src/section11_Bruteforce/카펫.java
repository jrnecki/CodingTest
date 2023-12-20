package section11_Bruteforce;

import java.util.ArrayList;

public class 카펫 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        int [] answer = solution(brown,yellow);
        System.out.println(answer);
    }
    public static int []  solution(int brown, int yellow) {
        int[] answer = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        int width = brown + yellow;
        for(int i=width/2; i>1; i--){
            if(width%i ==0){
                if(i>=3 && (width/i-2)*(i-2) == yellow){
                    answer[0] = i;
                    answer[1] = width/i;
                    break;
                }

            }
        }

        return answer;
    }
}
