import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        long M = 1234567891;
        long L = scann.nextInt();
        String str = scann.next();
        long hash = 0;
        for (int i = 0; i < L; i++) {
            long alpha = str.charAt(i) - 'a' + 1;
            for (int j = 0; j < i; j++) {
                alpha *= 31;
                alpha %= M;
            }
            hash = (hash + alpha) % M;
        }
        System.out.println(hash);
    }
}
