import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int res = 0;
        while (!queue.isEmpty()) {
            int card = queue.poll();
            if (queue.isEmpty()) {
                res = card;
                break;
            }

            card = queue.poll();
            queue.add(card);
        }

        System.out.println(res);
    }
}
