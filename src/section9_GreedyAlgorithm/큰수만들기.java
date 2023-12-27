package section9_GreedyAlgorithm;

public class 큰수만들기 {
    public static void main(String[] args) {
        solution("4177252841",4);
    }
    public static String solution(String number, int k) {
        String answer = "";
        int index =0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<number.length()-k; i++){
            char max = 0;
            for(int j=index; j<=i+k; j++){
                if(max < number.charAt(j)){
                    max = number.charAt(j);
                    index = j+1;
                    if(max == '9') break;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
