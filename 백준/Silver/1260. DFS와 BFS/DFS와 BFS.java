import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int N, M, V;
    public static boolean[][] graph;
    public static boolean[] visitDfs;
    public static Stack<Integer> stack = new Stack<>();

    public static List<Integer> bfs = new ArrayList<>();
    public static List<Integer> dfs = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        V = scanner.nextInt();
        graph = new boolean[N + 1][N + 1];
        visitDfs = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = true;
            graph[b][a] = true;
        }

        goDfs(V);
        goBfs(V);

        for (int i = 0; i < dfs.size(); i++) {
            System.out.print(dfs.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < bfs.size(); i++) {
            System.out.print(bfs.get(i) + " ");
        }
        System.out.println();

    }

    public static void goDfs(int v) {
        stack.add(v);
        visitDfs[v] = true;

        recursion(v);
    }

    public static void recursion(int v) {
        while (!stack.isEmpty()) {
            int now = stack.pop();
            dfs.add(now);

            for (int i = 1; i <= N; i++) {
                if (graph[now][i] && !visitDfs[i]) {
                    stack.add(i);
                    visitDfs[i] = true;
                    recursion(v);
                }
            }
        }
    }

    public static void goBfs(int v) {
        boolean[] visited = new boolean[N + 1];
        Queue<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            bfs.add(now);

            for (int i = 1; i <= N; i++) {
                if (graph[now][i] && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}