package section9_GreedyAlgorithm;

public class 조이스틱 {
    public static void main(String[] args) {
        solution("JEROEN");
    }
    public static int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;

        for(int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A')); //상하 변경
            if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                int endA = i + 1;
                while(endA < name.length() && name.charAt(endA) == 'A'){
                    endA++;
                }

                move = Math.min(move, i * 2 + (name.length() - endA));// 오른쪽-> 왼쪽-> 다시 원래로
                move = Math.min(move, i + (name.length() - endA) * 2);// 왼쪽-> 오른쪽-> 다시 원래로
            }
        }
        return answer + move;
    }

}
