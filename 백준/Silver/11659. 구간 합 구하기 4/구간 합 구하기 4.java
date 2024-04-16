import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int M = scann.nextInt();
        int[] numbers = new int[N];
        int[] sums = new int[N + 1];
        sums[0] = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = scann.nextInt();
            sums[i + 1] = numbers[i] + sums[i];
        }

        for (int i = 0; i < M; i++) {
            int x = scann.nextInt();
            int y = scann.nextInt();
            System.out.println(sums[y] - sums[x - 1]);
        }

    }
}