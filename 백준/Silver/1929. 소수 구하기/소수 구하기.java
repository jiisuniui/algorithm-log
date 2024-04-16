import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        boolean[] minority = new boolean[N + 1];
        Arrays.fill(minority, true);

        if (N == 1) {
            return;
        } else if (N == 2) {
            System.out.println("2");
            return;
        }

        for (int i = 2; i <= N; i++) {
            if (minority[i]) {
                int j = 2;
                while (j * i <= N) {
                    minority[j * i] = false;
                    j++;
                }

                if (i >= M) {
                    System.out.println(i);
                }
            }
        }
    }
}
