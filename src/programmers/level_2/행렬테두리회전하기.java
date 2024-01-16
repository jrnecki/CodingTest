package programmers.level_2;

import java.util.PriorityQueue;

class 행렬테두리회전하기 {
    int[][] graph;
   public int[] solution(int rows, int columns, int[][] queries) {
        int num = 1;
        graph = new int[rows][columns];
        int answer[] = new int[queries.length];
        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                graph[i][j] = num++;
            }
        }
        for(int i=0; i< queries.length; i++){
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];
            answer[i] = rotate(x1-1,y1-1,x2-1,y2-1);
        }
        return answer;
    }
    public Integer rotate(int x1,int y1, int x2, int y2){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int x = x1;
        int y = y1;
        int tmp = graph[x][y];

        for(int i=y1; i<y2; i++){ //right
            pq.offer(tmp);
            int tmp2 = graph[x1][i+1];
            graph[x1][i+1] = tmp;
            tmp = tmp2;
        }
        for(int i=x1; i<x2; i++){ //down
            pq.offer(tmp);
            int tmp2 = graph[i+1][y2];
            graph[i+1][y2] = tmp;
            tmp = tmp2;
        }

        for(int i=y2; i>y1; i--){ //left
            pq.offer(tmp);
            int tmp2 = graph[x2][i-1];
            graph[x2][i-1] = tmp;
            tmp = tmp2;
        }

        for(int i=x2; i>x1; i--){ //up
            pq.offer(tmp);
            int tmp2 = graph[i-1][y1];
            graph[i-1][y1] = tmp;
            tmp = tmp2;
        }


        return pq.poll();
    }
}
