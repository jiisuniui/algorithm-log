import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int ol = str.length();
            str = str.replaceAll(Integer.toString(i), "");
            int cl = str.length();
            for (int o = 0; o < ol - cl; o++) {
                sb.append(Integer.toString(i));
            }
        }

        System.out.println(sb.toString());
    }
}
