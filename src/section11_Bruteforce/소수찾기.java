package section11_Bruteforce;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    static int [] ch;
    static int [] pm;

    static char [] nums;
    static Set<Integer> list = new HashSet<>();
    public static void main(String[] args) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }
    public static int solution(String numbers) {
        int answer = 0;
        // 숫자만들기 dfs
        int n = numbers.length();
        ch = new int[n];
        pm = new int[n];
        nums = numbers.toCharArray();
        for(int i=1; i<=n; i++){
            dfs(0,i);
        }
        // 소수판별
        for(int i: list){
            System.out.println(i);
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    public static boolean isPrime(int num){
        if(num <2) return false;
        if(num == 2) return true;
        for(int i = 2; i<= num/2; i++ ){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static int dfs(int L, int n){
        if(L == n){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n;i++){
                sb.append(pm[i]);
            }
            list.add(Integer.parseInt(sb.toString()));
        }else{
            for(int i=0; i<nums.length; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = nums[i]-'0';
                    dfs(L+1,n);
                    ch[i] = 0;
                }
            }
        }
        return 0;
    }
}
