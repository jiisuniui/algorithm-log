
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            number.add(i, scann.nextInt());
        }

        int answer = 0;

        Collections.sort(number);
        List<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= number.get(N - 1); i++) {
            boolean isPrime = false;
            for (int j : prime) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                prime.add(i);
                if (number.contains(i)) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
