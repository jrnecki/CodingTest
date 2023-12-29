package section10_DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class N으로표현 {
    public static void main(String[] args) {
        int N = 5;
        int number = 12;
        solution(N,number);
    }
    public static int solution(int N, int number) {
        int answer = 0;
        ArrayList<Set<Integer>> countList = new ArrayList<>();
        for(int i=0; i<=8; i++){
            countList.add(new HashSet<Integer>());
        }
        // 1개를 사용할때는
        // 자신의 값만 만들 수 있음
        countList.get(1).add(N);

        for(int i=2; i<=8; i++){
            // i개로 만들 수 있는 값을 넣어보자
            Set<Integer> valueSet = countList.get(i);

            // j개로 만든 값 + i-j개로 만든 값의
            // 사칙연산 조합
            for(int j=1; j<i; j++){
                Set<Integer> set1 = countList.get(j);
                Set<Integer> set2 = countList.get(i-j);

                for(int n1 : set1){
                    for(int n2: set2){
                        valueSet.add(n1+n2);
                        valueSet.add(n1-n2);
                        valueSet.add(n1*n2);
                        if(n1 != 0 && n2 !=0){
                            valueSet.add(n1/n2);
                        }
                    }
                }

            }
            // i개를 연속으로 사용하여 만든 값
            valueSet.add(Integer.parseInt(String.valueOf(N).repeat(i)));
            countList.add(valueSet);
        }
        for(Set<Integer> values : countList){
            if(values.contains(number)){
                return countList.indexOf(values);
            }
        }
        return -1;
    }
}
