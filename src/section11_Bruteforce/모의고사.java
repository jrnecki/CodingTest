package section11_Bruteforce;

import java.util.ArrayList;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        solution(answers);
    }
    public static int[] solution(int[] answers) {
        int[] answer = {};
        int [] pick1 = {1,2,3,4,5};
        int answer1 = 0;
        int [] pick2 = {2,1,2,3,2,4,2,5};
        int answer2 = 0;
        int [] pick3 = {3,3,1,1,2,2,4,4,5,5};
        int answer3 = 0;
        int n = answers.length;
        for(int i=0; i<n; i++){
            if(answers[i] == pick1[i%pick1.length]){
                answer1++;
            }
            if(answers[i] == pick2[i%pick2.length]){
                answer2++;
            }
            if(answers[i] == pick3[i%pick3.length]){
                answer3++;
            }
        }

        int maxScore = Math.max(answer1, Math.max(answer2,answer3));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == answer1) {list.add(1);}
        if(maxScore == answer2) {list.add(2);}
        if(maxScore == answer3) {list.add(3);}
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;

    }
}
