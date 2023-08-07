import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static int N, M, K;
    static int[][] map;

    static int[] dr = { 1, 0, -1, 0 };
    static int[] dc = { 0, 1, 0, -1 };

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        N = scann.nextInt();
        M = scann.nextInt();
        K = scann.nextInt();
        map = new int[N][M];

        for (int i = 0; i < K; i++) {
            int r = scann.nextInt();
            int c = scann.nextInt();
            map[r - 1][c - 1] = 1;
        }

        int result = bfs();
        System.out.println(result);
    }

    public static class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int bfs() {
        int max = 0;
        Queue<Pos> queue = new LinkedList<Pos>();
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    continue;
                }
                if (visited[i][j]) {
                    continue;
                }

                int sum = 1;
                queue.add(new Pos(i, j));
                visited[i][j] = true;

                while (!queue.isEmpty()) {
                    Pos now = queue.poll();
                    for (int go = 0; go < 4; go++) {
                        int gr = now.x + dr[go];
                        int gc = now.y + dc[go];

                        if (checked(gr, gc) && !visited[gr][gc]) {
                            if (map[gr][gc] == 1) {
                                queue.add(new Pos(gr, gc));
                                visited[gr][gc] = true;
                                sum++;
                            }
                        }
                    }
                }
                if (max < sum) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}