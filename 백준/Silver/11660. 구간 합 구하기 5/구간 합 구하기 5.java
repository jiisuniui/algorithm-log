import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int M = scann.nextInt();
        int[][] arr = new int[N][N];
        int[][] sum = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scann.nextInt();

                if (i == 0 && j == 0) {
                    sum[i][j] = arr[i][j];
                } else if (i == 0) {
                    sum[i][j] = arr[i][j] + sum[i][j - 1];
                } else if (j == 0) {
                    sum[i][j] = arr[i][j] + sum[i - 1][j];
                } else {
                    sum[i][j] = arr[i][j] + sum[i][j - 1] + sum[i - 1][j] - sum[i - 1][j - 1];
                }
            }
        }

        for (int c = 0; c < M; c++) {
            int x1 = scann.nextInt() - 1;
            int y1 = scann.nextInt() - 1;
            int x2 = scann.nextInt() - 1;
            int y2 = scann.nextInt() - 1;

            int res = 0;
            if (x1 == 0 && y1 == 0) {
                res = sum[x2][y2];
            } else if (x1 == 0) {
                res = sum[x2][y2] - sum[x2][y1 - 1];
            } else if (y1 == 0) {
                res = sum[x2][y2] - sum[x1 - 1][y2];
            } else {
                res = sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1];
            }

            System.out.println(res);
        }

    }
}
