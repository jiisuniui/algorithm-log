import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    static int N;
    static int[][] map;
    static boolean success;
    static boolean[][] visited;

    static class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        N = scann.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = scann.nextInt();
            }
        }

        success = bfs();

        if (success) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }

    static int[] dr = { 1, 0 };
    static int[] dc = { 0, 1 };

    public static boolean bfs() {
        boolean result = false;
        Queue<Pos> queue = new LinkedList<Pos>();
        queue.add(new Pos(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Pos pos = queue.poll();
            int num = map[pos.x][pos.y];
            if (num == -1) {
                result = true;
                break;
            }
            for (int i = 0; i < 2; i++) {
                int nx = pos.x + dr[i] * num;
                int ny = pos.y + dc[i] * num;
                if (checked(nx, ny) && !visited[nx][ny]) {
                    queue.add(new Pos(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

        return result;
    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

}