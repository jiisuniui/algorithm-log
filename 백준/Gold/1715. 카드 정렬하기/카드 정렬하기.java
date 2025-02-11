
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        PriorityQueue<Long> card = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            card.add(scann.nextLong());
        }
        scann.close();

        long ans = 0;
        while (card.size() > 1) {
            long a = card.poll();
            long b = card.poll();
            long sum = a + b;

            ans += sum;
            card.add(sum);
        }

        System.out.println(ans);
    }

}
