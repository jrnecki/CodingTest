package programmers.level_1;

class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int hit = 0;
        int plus = 0;
        for(int i=0; i<lottos.length;i++){
            if(lottos[i] == 0){
                plus++;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        hit++;
                    }
                }
            }
        }

        answer[0] = hit+plus;
        answer[1] = hit;

        for(int i=0; i<answer.length; i++){
            if(answer[i]<2){
                answer[i] = 6;
            }else{
                answer[i] = 7-answer[i];
            }
        }

        return answer;
    }
}