import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int T = scann.nextInt();
        int[][] apart = new int[15][15];
        for (int i = 0; i < 15; i++) {
            apart[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apart[i][j] = apart[i - 1][j] + apart[i][j - 1];
            }
        }

        for (int t = 0; t < T; t++) {
            int k = scann.nextInt();
            int n = scann.nextInt();
            System.out.println(apart[k][n]);
        }

    }
}
