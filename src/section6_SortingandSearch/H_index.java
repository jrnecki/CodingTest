package section6_SortingandSearch;

import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {
        int [] citations = {3, 0, 6, 1, 5};

    }
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        int max = 0;
        for(int i = citations.length-1; i > -1; i--){
            int min = (int)Math.min(citations.length - i,citations[i]);
            if(max < min) max = min;
        }

        return max;
    }
}
