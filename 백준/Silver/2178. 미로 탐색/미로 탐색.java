import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int N, M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = { 0, 0, 1, -1 };
    static int[] dc = { 1, -1, 0, 0 };

    static int ans = Integer.MAX_VALUE;

    public static class Node {
        int x;
        int y;
        int count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        N = scann.nextInt();
        M = scann.nextInt();
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = scann.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs();

        System.out.println(ans);
    }

    public static void bfs() {
        Queue<Node> queue = new LinkedList<>();

        queue.add(new Node(0, 0, 1));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nr = node.x + dr[i];
                int nc = node.y + dc[i];

                if (nr == N - 1 && nc == M - 1) {
                    if (ans > node.count + 1) {
                        ans = node.count + 1;
                    }
                } else if (checked(nr, nc) && !visited[nr][nc] && map[nr][nc] == 1) {
                    visited[nr][nc] = true;
                    queue.add(new Node(nr, nc, node.count + 1));
                }
            }
        }

    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
