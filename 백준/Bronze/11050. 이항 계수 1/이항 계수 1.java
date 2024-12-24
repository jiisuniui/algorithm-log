import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int M = scann.nextInt();

        int u = 1;
        int d = 1;
        for (int i = 1; i <= M; i++) {
            u *= (N + 1 - i);
            d *= i;
        }

        System.out.println(u / d);
    }
}
