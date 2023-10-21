package section7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1_재귀함수 {
    public static void recursive(int n) {
        if (n == 0) {
            return;
        } else {
            recursive(n - 1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursive(n);
    }
}
