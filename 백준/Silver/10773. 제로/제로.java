import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int K = scann.nextInt();
        Stack<Integer> money = new Stack<>();

        for (int i = 0; i < K; i++) {
            int n = scann.nextInt();
            if (n == 0) {
                if (!money.isEmpty()) {
                    money.pop();
                }
            } else {
                money.add(n);
            }
        }

        int sum = 0;
        while (!money.isEmpty()) {
            sum += money.pop();
        }

        System.out.println(sum);
    }
}
