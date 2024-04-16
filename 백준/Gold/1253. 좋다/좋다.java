import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scann.nextInt();
        }
        Arrays.sort(A);

        boolean[] isGood = new boolean[N];
        int answer = 0;

        for (int a = 0; a < N; a++) {
            if (a > 0 && A[a] == A[a - 1]) {
                if (isGood[a - 1]) {
                    answer++;
                    isGood[a] = true;
                }
                continue;
            }

            int i = (a == 0) ? 1 : 0;
            int j = (a == N - 1) ? N - 2 : N - 1;
            while (i != j) {
                long sum = A[i] + A[j];
                if (sum == A[a]) {
                    answer++;
                    isGood[a] = true;
                    break;
                } else if (sum < A[a]) {
                    i++;
                    if (a == i) {
                        i++;
                    }
                } else if (sum > A[a]) {
                    j--;
                    if (a == j) {
                        j--;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
