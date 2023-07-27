import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dr = { 0, 0, 1, -1 };
    static int[] dc = { 1, -1, 0, 0 };

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
        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = scann.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int result = dfs();
        System.out.println(result);

        scann.close();
    }

    public static int dfs() {
        Stack<Pos> stack = new Stack<Pos>();
        int floor = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited[i][j]) {
                    continue;
                }
                stack.push(new Pos(i, j));
                visited[i][j] = true;

                while (!stack.isEmpty()) {
                    Pos now = stack.pop();
                    if (map[now.x][now.y] == '-') {
                        for (int g = 0; g < 2; g++) {
                            int gr = now.x + dr[g];
                            int gc = now.y + dc[g];
                            if (checked(gr, gc) && !visited[gr][gc] && map[gr][gc] == map[now.x][now.y]) {
                                stack.push(new Pos(gr, gc));
                                visited[gr][gc] = true;
                            }
                        }
                    } else {
                        for (int g = 2; g < 4; g++) {
                            int gr = now.x + dr[g];
                            int gc = now.y + dc[g];
                            if (checked(gr, gc) && !visited[gr][gc] && map[gr][gc] == map[now.x][now.y]) {
                                stack.push(new Pos(gr, gc));
                                visited[gr][gc] = true;
                            }
                        }
                    }
                }
                floor++;
            }
        }

        return floor;
    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
