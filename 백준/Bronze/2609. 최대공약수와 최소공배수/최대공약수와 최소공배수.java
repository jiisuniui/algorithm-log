import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int a = scann.nextInt();
        int b = scann.nextInt();

        int small = Math.min(a, b);
        int num = 2;
        int min = 1;
        int max = 1;

        for (;;) {
            if (num > small) {
                max = min * a * b;
                break;
            }

            if (a == 1) {
                max = min * b;
                break;
            } else if (b == 1) {
                max = min * a;
                break;
            }

            if (a % num == 0 && b % num == 0) {
                a /= num;
                b /= num;
                min *= num;
            } else {
                num++;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
