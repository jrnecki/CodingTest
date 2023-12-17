package section6_SortingandSearch;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        solution(numbers);
    }
    public static void solution(int[] numbers) {
        String answer = "";
        String [] nums = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            nums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String str : nums){
            sb.append(str);
        }
        answer = sb.toString();

    }
}
