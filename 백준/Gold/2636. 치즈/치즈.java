import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{

    static int N, M;
    static int[][] map;

    static int[] dx = { 0, 1, 0, -1 };
    static int[] dy = { 1, 0, -1, 0 };
    static int cheese = 0;
    static int time = 0;

    static class Pos {
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        N = scann.nextInt();
        M = scann.nextInt();
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = scann.nextInt();
                if (map[i][j] == 1) {
                    cheese++;
                }
            }
        }

        int lastCheese = 0;
        while (cheese != 0) {
            lastCheese = cheese;
            meltingCheese();
            time++;

            // for (int i = 0; i < N; i++) {
            //     for (int j = 0; j < M; j++) {
            //         System.out.print(map[i][j] + " ");
            //     }
            //     System.out.println();
            // }
            // System.out.println();
        }

        System.out.println(time);
        System.out.println(lastCheese);
    }

    public static void meltingCheese() {
        Queue<Pos> queue = new LinkedList<Pos>();
        boolean[][] visited = new boolean[N][M];

        queue.add(new Pos(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Pos now = queue.poll();
            for (int i = 0; i < 4; i++) {
                Pos next = new Pos(now.x + dx[i], now.y + dy[i]);
                if (!checked(next.x, next.y)) {
                    continue;
                }

                if (visited[next.x][next.y] == false) {
                    if (map[next.x][next.y] == 0) {
                        queue.add(next);
                        visited[next.x][next.y] = true;
                    } else if (map[next.x][next.y] == 1) {
                        map[next.x][next.y] = 0;
                        visited[next.x][next.y] = true;
                        cheese--;
                    }
                }
            }
        }
    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
