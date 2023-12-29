package section10_DynamicProgramming;

public class 정수삼각형 {
    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(solution(triangle));
    }
    public  static int solution(int[][] triangle){
        int answer = 0;
        for(int i=1; i<triangle.length; i++){
            triangle[i][0] += triangle[i-1][0];
            triangle[i][i] += triangle[i-1][i-1];
            for(int j=1; j<i;j++){
                triangle[i][j] += Math.max(triangle[i-1][j-1],triangle[i-1][j]);
            }
        }
        for(int i=0; i< triangle.length; i++){
            answer = Math.max(answer,triangle[triangle.length-1][i]);
        }
        return answer;
    }


}
