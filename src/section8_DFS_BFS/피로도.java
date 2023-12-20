package section8_DFS_BFS;

public class 피로도 {
    static int answer = -1;
    static int[] check;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        check = new int [dungeons.length];
        System.out.println(answer);

    }
    public void dfs(int hp, int L, int[][] dungeons){
        for(int i=0; i<dungeons.length; i++){
            if(check[i] == 0 && hp >= dungeons[i][0] ){
                check[i] = 1;
                dfs(hp-dungeons[i][1],L+1, dungeons);
                check[i] = 0;
            }
        }
        answer = Math.max(answer,L);
    }
}
