package section9_GreedyAlgorithm;

public class 체육복 {
    public static void main(String[] args) {
        int n = 5;
        int [] lost = {2,4};
        int [] reserve = {1,3,5};
        solution(5,lost,reserve);
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        //Arrays.sort(reserve);
        //Arrays.sort(lost);
        // 현재 체육복이 있는 학생 수
        int answer = n-lost.length;

        // 여벌옷이 있지만 도난당한 경우
        // 빌려줄수 없다.
        // 체육복이 있다.
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 도난당했지만
        for(int i=0; i<lost.length; i++){
            // 빌린경우 answer++
            for(int j=0; j<reserve.length; j++){
                if(lost[i] -1 == reserve[j] ||
                        lost[i]+1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
