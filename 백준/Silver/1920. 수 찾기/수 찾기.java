import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Arrays.sort(A);

        int M = scanner.nextInt();
        for (int m = 0; m < M; m++) {
            int target = scanner.nextInt();
            boolean find = false;

            int start = 0;
            int end = N - 1;

            while (start <= end) {
                int mid = (start + end) / 2;
                if (target < A[mid]) {
                    end = mid - 1;
                } else if (target > A[mid]) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }

            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
