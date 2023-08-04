import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();

        for (int i = N; i >= 4; i--) {
            boolean minsu = true;
            int num = i;
            while (num != 0) {
                if (num % 10 == 4 || num % 10 == 7)
                    num /= 10;
                else {
                    minsu = false;
                    break;
                }
            }

            if (minsu) {
                System.out.println(i);
                break;
            }
        }
    }
}
