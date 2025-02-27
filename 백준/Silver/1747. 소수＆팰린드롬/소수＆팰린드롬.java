
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        scann.close();

        int[] prime = new int[1000001];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i] == 0) {
                continue;
            }
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = 0;
            }
        }

        int ans = 0;
        for (int i = N;; i++) {
            if (i < prime.length) {
                if (prime[i] != 0 && isPalindrome(i)) {
                    ans = i;
                    break;
                }
            } else {
                boolean isPrime = true;
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (prime[j] != 0 && i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime && isPalindrome(i)) {
                    ans = i;
                    break;
                }
            }
        }

        System.out.println(ans);

    }

    public static boolean isPalindrome(int num) {
        int origin = num;
        int swap = 0;
        while (origin != 0) {
            swap = swap * 10 + origin % 10;
            origin = origin / 10;
        }
        if (swap == num) {
            return true;
        }
        return false;
    }
}
