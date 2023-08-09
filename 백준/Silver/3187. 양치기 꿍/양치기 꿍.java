import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int R, C;
    static char[][] map;
    static int[] dr = { 0, 0, 1, -1 };
    static int[] dc = { 1, -1, 0, 0 };

    static int sheep = 0;
    static int wolf = 0;

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        R = scann.nextInt();
        C = scann.nextInt();
        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = scann.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        dfs();

        System.out.println(sheep + " " + wolf);
    }

    static class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void dfs() {
        Stack<Pos> stack = new Stack<>();
        boolean[][] visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (visited[i][j]) {
                    continue;
                }
                if (map[i][j] == '#') {
                    continue;
                }

                int v = 0;
                int k = 0;
                if (map[i][j] == 'v') {
                    v++;
                } else if (map[i][j] == 'k') {
                    k++;
                }
                stack.push(new Pos(i, j));
                visited[i][j] = true;

                while (!stack.isEmpty()) {
                    Pos start = stack.pop();
                    for (int next = 0; next < 4; next++) {
                        int nr = start.x + dr[next];
                        int nc = start.y + dc[next];

                        if (checked(nr, nc) && !visited[nr][nc]) {
                            if (map[nr][nc] == '#') {
                                continue;
                            } else if (map[nr][nc] == 'v') {
                                v++;
                            } else if (map[nr][nc] == 'k') {
                                k++;
                            }

                            visited[nr][nc] = true;
                            stack.push(new Pos(nr, nc));
                        }
                    }
                }

                // System.out.println(k + " " + v);
                if (v >= k) {
                    wolf += v;
                } else {
                    sheep += k;
                }
            }
        }
    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < R && y >= 0 && y < C;
    }
}
