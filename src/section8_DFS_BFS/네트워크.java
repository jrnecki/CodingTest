package section8_DFS_BFS;

public class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[n];
        for(int i=0; i<computers.length; i++){
            if(visited[i]==0){
                answer++;
                dfs(i,visited,computers);
            }
        }
        return answer;
    }
    public void dfs(int index,int[] visited, int[][] computers){
        visited[index] = 1;
        // 연결 컴퓨터
        for(int i=0; i<computers.length; i++){
            if(computers[i][index]==1 && visited[i]==0){
                dfs(i,visited,computers);
            }
        }
    }
}
