package section11_Bruteforce;

public class 최소직사각형 {
    public static void main(String[] args) {
        int [][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        int maxX = 0;
        int maxY = 0;
        for(int [] size : sizes){
            int x=Math.max(size[0],size[1]);
            int y=Math.min(size[0],size[1]);
            maxX=Math.max(maxX,x);
            maxY=Math.max(maxY,y);
        }
        return maxX * maxY;

    }
}
