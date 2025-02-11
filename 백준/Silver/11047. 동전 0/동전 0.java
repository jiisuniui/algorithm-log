import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int K = scann.nextInt();
        int[] coin = new int[N];
        for (int i = 0; i < N; i++) {
            coin[i] = scann.nextInt();
        }
        Arrays.sort(coin);
        scann.close();

        int ans = 0;
        for (int i = N - 1; i >= 0; i--) {
            int c = coin[i];
            if (K >= c) {
                ans += K / c;
                K = K % c;
            }

            if (K == 0) {
                break;
            }
        }

        System.out.println(ans);
    }
}
