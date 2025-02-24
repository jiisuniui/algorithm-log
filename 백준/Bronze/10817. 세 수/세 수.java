import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scann.nextInt();
        }
        scann.close();

        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
