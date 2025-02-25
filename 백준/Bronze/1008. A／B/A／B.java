import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int A = scann.nextInt();
        int B = scann.nextInt();
        scann.close();
        System.out.println((double) A / (double) B);
    }
}
