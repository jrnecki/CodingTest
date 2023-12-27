package section9_GreedyAlgorithm;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        int [] people = {70, 50, 80, 50};
        solution(people,100);
    }
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lt = 0;
        int rt = people.length-1;
        while(lt<=rt){
            if(people[lt]+people[rt] <=limit){
                lt++;
                rt--;
                answer++;
            }else{
                rt--;
                answer++;
            }
        }

        return answer;
    }
}
