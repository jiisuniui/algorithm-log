import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int answer = 0;

        for (int i = N / 2; i <= N; i++) {
            int M = i;
            int sum = M;
            while (M != 0) {
                sum += M % 10;
                M /= 10;
            }

            if (N == sum) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
