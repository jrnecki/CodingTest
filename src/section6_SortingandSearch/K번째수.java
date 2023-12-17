package section6_SortingandSearch;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {
    public static void main(String[] args) {
        	int[] array = {1, 5, 2, 6, 3, 7, 4};
            int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

            solution(array,commands);
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        int n = commands.length;
        answer = new int[n];
        for(int i=0; i<n; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=start-1; j<end; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(target-1);
        }
        return answer;
    }
}
