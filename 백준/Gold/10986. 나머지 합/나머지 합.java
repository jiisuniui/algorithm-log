import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int M = scann.nextInt();
        int[] arr = new int[N + 1];
        int[] sum = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = scann.nextInt();
            long s = sum[i - 1] + arr[i];
            sum[i] = (int) (s % M);
        }

        long[] num = new long[M];
        for (int i = 1; i <= N; i++) {
            num[(int) sum[i]]++;
        }

        long result = 0;
        for (int i = 0; i < M; i++) {
            if (i == 0) {
                result += num[i];
            }
            result += (num[i] * (num[i] - 1)) / 2;
        }
        System.out.println(result);
    }
}
