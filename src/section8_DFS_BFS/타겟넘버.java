package section8_DFS_BFS;

public class 타겟넘버 {
    static int answer=0;
    public int solution(int[] numbers, int target) {

        dfs(0,0,numbers,target);
        return answer;
    }
    public void dfs(int sum, int depth, int[] numbers, int target){
        if(depth == numbers.length){
            if(sum == target){
                answer++;
            }
        }else{
            dfs(sum+numbers[depth],depth+1,numbers,target);
            dfs(sum-numbers[depth],depth+1,numbers,target);
        }
    }
}
