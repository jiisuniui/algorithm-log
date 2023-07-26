import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        String[] files = new String[N];
        for (int i = 0; i < N; i++) {
            files[i] = scann.next();
        }

        String pattern = files[0];
        for (int i = 1; i < N; i++) {
            String file = files[i];
            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) == '?') {
                    continue;
                }
                if (pattern.charAt(j) != file.charAt(j)) {
                    pattern = pattern.substring(0, j) + '?' + pattern.substring(j + 1, pattern.length());
                }
            }
        }

        System.out.println(pattern);
    }
}
