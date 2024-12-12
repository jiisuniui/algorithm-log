import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        int i = 0;
        int num = 1;
        boolean find = false;

        while (!find) {
            if (num <= N && N <= num + i * 6) {
                find = true;
            }
            num += i * 6;
            i++;
        }
        System.out.println(i);
    }
}
