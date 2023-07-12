import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] mushroom = new int[10];
        for (int i = 0; i < 10; i++) {
            mushroom[i] = scann.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += mushroom[i];
            if (sum >= 100) {
                if (Math.abs(100 - sum) > Math.abs(100 - sum + mushroom[i])) {
                    sum -= mushroom[i];
                }
                break;
            }
        }

        System.out.println(sum);
    }
}
