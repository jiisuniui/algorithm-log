import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int L = scann.nextInt();
        String str = scann.next();
        long hash = 0;
        for (int i = 0; i < L; i++) {
            int alpha = str.charAt(i) - 'a';
            hash += (alpha + 1) * Math.pow(31, i);
        }
        System.out.println(hash);
    }
}
