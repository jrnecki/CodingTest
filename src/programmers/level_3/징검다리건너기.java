package programmers.level_3;

public class 징검다리건너기 {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int lt = 1;
        int rt = Integer.MAX_VALUE;

        while(lt <= rt){
            int mid = (lt+rt)/2;
            if(canGo(mid, stones, k)){
                lt = mid+1;
                answer = Math.max(answer, mid);
            }else{
                rt = mid -1;
            }
        }
        return answer;
    }
    public boolean canGo(int mid, int[] stones, int k){
        int skip = 0;
        for(int stone : stones){
            if(stone - mid < 0){
                skip++;
            }else{
                skip = 0;
            }
            if(skip == k) return false;

        }
        return true;
    }
}
