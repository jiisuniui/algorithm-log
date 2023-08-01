import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static char[][] map;
    static boolean[][] visited;
    static int[] dr = { 1, -1, 0, 0 };
    static int[] dc = { 0, 0, 1, -1 };

    public static class Pos {
        int x;
        int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];
        Pos me = new Pos(0, 0);

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
                if (map[i][j] == 'I') {
                    me = new Pos(i, j);
                }
            }
        }

        int people = dfs(me);

        if (people == 0) {
            System.out.println("TT");
        } else {
            System.out.println(people);
        }
    }

    public static int dfs(Pos me) {
        int sum = 0;
        Stack<Pos> stack = new Stack<>();
        stack.add(me);
        visited[me.x][me.y] = true;

        while (!stack.isEmpty()) {
            Pos now = stack.pop();
            if (map[now.x][now.y] == 'P') {
                sum++;
            }
            for (int i = 0; i < 4; i++) {
                int nr = now.x + dr[i];
                int nc = now.y + dc[i];
                if (checked(nr, nc) && !visited[nr][nc] && map[nr][nc] != 'X') {
                    stack.add(new Pos(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }

        return sum;
    }

    public static boolean checked(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}
