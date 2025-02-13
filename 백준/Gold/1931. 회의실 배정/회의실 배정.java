import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static class Time implements Comparable<Time> {
        int start;
        int end;

        public Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Time o) {
            if (this.end == o.end) {
                return this.start - o.start;
            } else {
                return this.end - o.end;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int N = scann.nextInt();
        PriorityQueue<Time> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int s = scann.nextInt();
            int e = scann.nextInt();
            pq.add(new Time(s, e));
        }

        int ans = 0;
        int now = 0;
        while (!pq.isEmpty()) {
            Time time = pq.poll();
            if (now > time.start) {
                continue;
            }
            now = time.end;
            ans++;
        }

        System.out.println(ans);
    }
}
