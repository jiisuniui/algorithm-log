
import java.util.Scanner;

public class Main {

    static int[] video;
    static int N, M;

    static int start, end = 0;

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        N = scann.nextInt();
        M = scann.nextInt();
        video = new int[N];
        for (int i = 0; i < N; i++) {
            video[i] = scann.nextInt();

            if (start < video[i]) {
                start = video[i];
            }
            end += video[i];
        }
        scann.close();

        while (start <= end) {
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (sum + video[i] > middle) {
                    count++;
                    sum = 0;
                }
                sum = sum + video[i];
            }

            if (sum != 0) {
                count++;
            }

            if (count > M) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        System.out.println(start);
    }

}
