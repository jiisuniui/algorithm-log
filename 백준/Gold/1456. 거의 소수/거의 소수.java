import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        long A = scann.nextLong();
        long B = scann.nextLong();
        scann.close();

        int S = (int) Math.sqrt(B);
        boolean[] sosu = new boolean[S + 1];
        Arrays.fill(sosu, true);

        sosu[0] = false;
        sosu[1] = false;
        for (int i = 2; i <= S; i++) {
            if (!sosu[i]) {
                continue;
            }

            for (int j = i * 2; j <= S; j += i) {
                sosu[j] = false;
            }
        }

        int ans = 0;
        for (int i = 2; i <= S; i++) {
            if (sosu[i]) {
                long tmp = i;
                while (tmp <= (double) B / i) {
                    if ((double) A / i <= tmp) {
                        ans++;
                    }
                    tmp *= i;
                }
            }

        }

        System.out.println(ans);

    }
}
