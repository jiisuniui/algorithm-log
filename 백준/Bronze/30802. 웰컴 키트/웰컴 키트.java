import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = scann.nextInt();
        }
        int T = scann.nextInt();
        int P = scann.nextInt();

        int minT = 0;
        int setP = 0;
        int oneP = 0;

        for (int i = 0; i < 6; i++) {
            minT += (size[i] % T == 0) ? size[i] / T : size[i] / T + 1;
        }

        setP = N / P;
        oneP = N % P;

        System.out.println(minT);
        System.out.println(setP + " " + oneP);
    }
}
