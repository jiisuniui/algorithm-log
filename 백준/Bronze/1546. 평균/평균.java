import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int count = scann.nextInt();
        int[] score = new int[count];
        int max = 0;
        for (int i = 0; i < count; i++) {
            score[i] = scann.nextInt();
            if (max < score[i]) {
                max = score[i];
            }
        }

        float sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ((float) score[i] / (float) max) * 100;
        }
        sum /= (float) count;

        System.out.println(sum);
    }
}
