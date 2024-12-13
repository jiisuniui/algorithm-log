import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        for (;;) {
            String str = scann.nextLine();
            if (str.equals("0")) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(str.charAt(i));
            }

            if (str.equals(sb.toString())) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
