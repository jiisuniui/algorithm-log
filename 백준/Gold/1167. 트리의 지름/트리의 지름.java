import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int V;
    static List<Node>[] nodes;
    static long ans = 0;

    public static class Node {
        int vertex;
        int distance;

        Node(int v, int d) {
            this.vertex = v;
            this.distance = d;
        }
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        V = scann.nextInt();
        nodes = new ArrayList[V + 1];

        for (int i = 0; i < V; i++) {
            int v = scann.nextInt();
            int w = scann.nextInt();
            nodes[v] = new ArrayList<>();
            while (w != -1) {
                nodes[v].add(new Node(w, scann.nextInt()));
                w = scann.nextInt();
            }
        }

        bfs(1);

        System.out.println(ans);
    }

    public static void bfs(int s) {
        long[] sum = new long[V + 1];
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[V + 1];

        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Node next : nodes[now]) {
                if (!visited[next.vertex]) {
                    long dis = sum[now] + next.distance;
                    if (sum[next.vertex] < dis) {
                        sum[next.vertex] = dis;
                    }
                    queue.add(next.vertex);
                    visited[next.vertex] = true;
                }
            }
        }

        int n = 0;
        for (int i = 1; i <= V; i++) {
            if (sum[i] > sum[n]) {
                n = i;
            }
        }

        sum = new long[V + 1];
        visited = new boolean[V + 1];
        queue.clear();

        visited[n] = true;
        queue.add(n);
        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Node next : nodes[now]) {
                if (!visited[next.vertex]) {
                    long dis = sum[now] + next.distance;
                    if (sum[next.vertex] < dis) {
                        sum[next.vertex] = dis;
                    }
                    queue.add(next.vertex);
                    visited[next.vertex] = true;
                }
            }
        }

        for (int i = 1; i <= V; i++) {
            if (sum[i] > ans) {
                ans = sum[i];
            }
        }

    }
}
