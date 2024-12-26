import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int x = N / 2;
        int y = N / 2 + 1;

        int count = 1;
        int sum = x + y;
        while (x >= 1) {
            if (sum < N) {
                x--;
                sum += x;
            } else if (sum > N) {
                sum -= y;
                y--;
            } else {
                count++;

                sum -= y;
                x--;
                y--;
                sum += x;
            }
        }

        System.out.println(count);
    }
}
