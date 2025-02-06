import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int k = scann.nextInt();
        scann.close();

        long start = 1;
        long end = k;
        long ans = 0;

        while (start <= end) {
            long middle = (start + end) / 2;
            long count = 0;

            for (int i = 1; i <= N; i++) {
                long plus = (middle / i > N) ? N : middle / i;
                count += plus;
            }

            if (count < k) {
                start = middle + 1;
            } else {
                ans = middle;
                end = middle - 1;
            }
        }
        System.out.println(ans);
    }
}
