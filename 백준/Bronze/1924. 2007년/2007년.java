import java.util.Scanner;

public class Main {
    static int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    static String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int m = scann.nextInt();
        int d = scann.nextInt();

        int day = 0;
        for (int i = 1; i <= m - 1; i++) {
            day += month[i];
        }
        day += d;
        day = day % 7;
        System.out.println(week[day]);
    }
}
